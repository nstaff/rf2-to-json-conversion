/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ihtsdo.json.model.versioned;

import java.util.List;

/**
 *
 * @author Alejandro Rodriguez
 */
public class Concept4F {
	Long conceptId;
    List<ConceptDescriptor> versions;
    List<RefsetMembership> memberships;
    List<Description> descriptions;
    List<Relationship> relationships;
    List<Relationship> statedRelationships;
    
    public Concept4F() {
    }

	public List<RefsetMembership> getMemberships() {
		return memberships;
	}

	public void setMemberships(List<RefsetMembership> memberships) {
		this.memberships = memberships;
	}

	public List<Description> getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}

	public List<Relationship> getRelationships() {
		return relationships;
	}

	public void setRelationships(List<Relationship> relationships) {
		this.relationships = relationships;
	}

	public List<Relationship> getStatedRelationships() {
		return statedRelationships;
	}

	public void setStatedRelationships(List<Relationship> statedRelationships) {
		this.statedRelationships = statedRelationships;
	}

	public Long getConceptId() {
		return conceptId;
	}

	public void setConceptId(Long conceptId) {
		this.conceptId = conceptId;
	}

	public List<ConceptDescriptor> getVersions() {
		return versions;
	}

	public void setVersions(List<ConceptDescriptor> versions) {
		this.versions = versions;
	}

}
