    
    define([
        'plugin/PluginConfig',
        'text!./metadata.json',
        'plugin/PluginBase'
    ], function (
        PluginConfig,
        pluginMetadata,
        PluginBase) {
        'use strict';
    
        pluginMetadata = JSON.parse(pluginMetadata);
    
        var modeltransformation = function () {
            // Call base class' constructor.
            PluginBase.call(this);
            this.pluginMetadata = pluginMetadata;
            this.pathToNode = {};
            this.trgElements = {};
            this.traces = {
                trace: []
            };
        };
        
        modeltransformation.metadata = pluginMetadata;
        modeltransformation.prototype = Object.create(PluginBase.prototype);
        modeltransformation.prototype.constructor = modeltransformation;
    
    modeltransformation.prototype.main = function (callback) {

        var self = this,
        	t,
        	t1,
        	trgModelNode,
        	elem;
        
        self.extractDataModel()
            .then(function () {

                /* Setting the pointer to the trgModel node where the target model will be stored */
                trgModelNode = self.activeNode;
                
                /* First phase - Element creation */
                                for (var key in self.pathToNode){
                                    elem = self.pathToNode[key];
                                
                
                if (self.isMetaTypeOf(elem, self.META['Class']) === true) {
                 	var c = elem;
                                     	
                                     	self.logger.error('Rule: Class 2 Table');
                                     	/* Elements creation */
                                     
                                     var trace0 = {
                                            srcElementIds: [],
                                            trgElementId: '',
                                            ruleName: '',
                                            position: 0
                                        }; // Missing the rest of the traces
                                     
                	        				t = self.core.createNode({
                                            parent: trgModelNode,
                                            base: self.META.Table
                                        });
                                        self.core.setAttribute(t, 'name', 'Table');
                                        //--
                		                        
                		                        var nav0 = c;
                		                        
                		                        var nav0 = self.core.getAttribute(nav0, 'nname');
                		                        var left = nav0;
                		                        var exp = left;
                		                        self.core.setAttribute(t, 'nname', exp);
                		                        //--
                                        //--
                                        self.core.setRegistry(t, 'position', {x: 50, y: 100});
                                        self.trgElements[self.core.getPath(t)] = t;
                                        trace0.srcElementIds.push(key);
                                        trace0.trgElementId = self.core.getPath(t);
                                        trace0.ruleName = 'Name';
                                        trace0.position = 1;
                                        self.traces[trace0.srcElementIds + '-' + trace0.position] = trace0;
                        				                     
                                     var trace1 = {
                                            srcElementIds: [],
                                            trgElementId: '',
                                            ruleName: '',
                                            position: 0
                                        }; // Missing the rest of the traces
                                     
                	        				t1 = self.core.createNode({
                                            parent: trgModelNode,
                                            base: self.META.Column
                                        });
                                        self.core.setAttribute(t1, 'name', 'Column');
                                        //--
                		                        
                		                        var nav0 = c;
                		                        
                		                        var nav0 = self.core.getAttribute(nav0, 'nname');
                		                        var left = nav0;
                		                        var right = '_column';
                		                        var exp = left	
                		                        +
                		                        right;
                		                        self.core.setAttribute(t1, 'nname', exp);
                		                        //--
                                        self.core.setRegistry(t1, 'position', {x: 50, y: 100});
                                        self.trgElements[self.core.getPath(t1)] = t1;
                                        trace1.srcElementIds.push(key);
                                        trace1.trgElementId = self.core.getPath(t1);
                                        trace1.ruleName = 'Name';
                                        trace1.position = 2;
                                        self.traces[trace1.srcElementIds + '-' + trace1.position] = trace1;
                        				;
                                     	}
                			        
                                }
                                self.logger.error('First phase finished. Starting second phase');
                
                /* Second phase - Association creation */
                                for (var key in self.pathToNode){
                                    elem = self.pathToNode[key];
                                
                
                if (self.isMetaTypeOf(elem, self.META['Class']) === true) {
                 	var c = elem;
                                     	
                                     	self.logger.error('Rule: Class 2 Table');
                                     	/* Elements creation */
                                     
                                        
                                        
                                        
                                        
                                        
                                        
                		                        //--
                		                        t = self.resolve(elem, 1);
                		                        var left = c;
                		                        var left = left;
                		                        				var left = self.resolve(left, 2);
                		                        var exp = left;
                		                        if ( exp instanceof Array ) {
                		                        	self.addChildren(t, exp);
                		                        } else {
                		                        	self.addChild(t, exp);
                		                        }
                		                        //--
                                     
                                        
                                        
                                        
                                     	}
                			        
                                }		          
                                self.logger.error('done');

            })
            .then(function () {
                return self.save('class2relational updated model.');
            })
            .then(function () {
                self.result.setSuccess(true);
                callback(null, self.result);
            })

    };
    
    modeltransformation.prototype.addChild = function (node, childNode, callback) {
            /** Given an source element, this method returns the element created from it in the position specified in the second parameter */
            var self = this;
            self.core.moveNode(childNode, node);
        }
        
        modeltransformation.prototype.addChildren = function (node, childNodes, callback) {
            /** Given an source element, this method returns the element created from it in the position specified in the second parameter */
            var self = this;
            for (var ii = 0; ii < childNodes.length; ii += 1) {
                self.core.moveNode(childNodes[ii], node);
            }
        }
    
        modeltransformation.prototype.setParent = function (node, parentNode, callback) {
            /** Given an source element, this method returns the element created from it in the position specified in the second parameter */
            var self = this;
            self.core.moveNode(node, parentNode);
        }
    
        modeltransformation.prototype.resolve = function (sourceNode, position, callback) {
            /** Given an source element, this method returns the element created from it in the position specified in the second parameter */
            var self = this;
            return self.trgElements[self.traces[self.core.getPath(sourceNode) + '-' + position].trgElementId];
    
        }
        modeltransformation.prototype.navigateToNode = function (sourceNode, pointerName, callback) {
            var self = this,
                pointerPath,
                targetNode;
    
            pointerPath = self.core.getPointerPath(sourceNode, pointerName);
            targetNode = self.pathToNode[pointerPath];
    
            return targetNode;
        }
    
        modeltransformation.prototype.getChildrenPaths = function (node, callback) {
            var self = this,
                nodesPath;
    
            nodesPath = this.core.getChildrenPaths(node);
            return nodesPath;
        }
    
        modeltransformation.prototype.getChildren = function (node, callback) {
            var self = this,
                childrenPath,
                i,
                children = [];
    
            childrenPath = this.core.getChildrenPaths(node);
            for (i = 0; i < childrenPath.length; i += 1) {
                children.push(self.pathToNode[childrenPath[i]]);
            }
            return children;
        }
    
        modeltransformation.prototype.extractDataModel = function (callback) {
            var self = this;
    
            // In order to avoid multiple iterative asynchronous 'load' calls we pre-load all the nodes in the family
            // and build up a local hash-map where the keys are the path/id of the nodes and the value the (nodes) objects
            // themselves. The info is stored in self.pathToNode
            return this.core.loadSubTree(self.activeNode)
                .then(function (nodes) {
    
                    var i,
                        childNode,
                        childName,
                        childrenPaths;
    
                    for (i = 0; i < nodes.length; i += 1) {
                        // For each node in the subtree we get the path and use it for the index of the hash-map, where
                        // values are the actual node.
                        self.pathToNode[self.core.getPath(nodes[i])] = nodes[i];
                    }
    
                    return null;
                })
                .nodeify(callback);
        };

    return modeltransformation;
});
