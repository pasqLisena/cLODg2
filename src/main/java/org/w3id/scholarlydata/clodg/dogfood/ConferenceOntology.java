/* CVS $Id: $ */
package org.w3id.scholarlydata.clodg.dogfood; 
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
 
/**
 * Vocabulary definitions from ontologies/conference-ontology.owl 
 * @author Auto-generated by schemagen on 29 Apr 2016 12:46 
 */
public class ConferenceOntology {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    //public static final String NS = "http://www.scholarlydata.org/ontology/conference-ontology.owl#";
    public static final String NS = "https://w3id.org/scholarlydata/ontology/conference-ontology.owl#";
    
    //public static final String RESOURCE_NS = "http://www.scholarlydata.org/";
    public static final String RESOURCE_NS = "https://w3id.org/scholarlydata/";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    public static Model getModel(){
    	return m_model;
    }
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    public static final Property abstract_ = m_model.createProperty( NS + "abstract" );
    
    public static final Property description = m_model.createProperty( NS + "description" );
    
    public static final Property doi = m_model.createProperty( NS + "doi" );
    
    public static final Property duration = m_model.createProperty( NS + "duration" );
    
    public static final Property during = m_model.createProperty( NS + "during" );
    
    public static final Property endDate = m_model.createProperty( NS + "endDate" );
    
    public static final Property familyName = m_model.createProperty( NS + "familyName" );
    
    public static final Property givenName = m_model.createProperty( NS + "givenName" );
    
    public static final Property hasAddress = m_model.createProperty( NS + "hasAddress" );
    
    public static final Property hasAffiliation = m_model.createProperty( NS + "hasAffiliation" );
    
    public static final Property hasAuthorList = m_model.createProperty( NS + "hasAuthorList" );
    
    public static final Property hasContent = m_model.createProperty( NS + "hasContent" );
    
    public static final Property hasFirstItem = m_model.createProperty( NS + "hasFirstItem" );
    
    public static final Property hasItem = m_model.createProperty( NS + "hasItem" );
    
    public static final Property hasLastItem = m_model.createProperty( NS + "hasLastItem" );
    
    public static final Property hasLocation = m_model.createProperty( NS + "hasLocation" );
    
    public static final Property relatesToEvent = m_model.createProperty( NS + "relatesToEvent" );
    
    public static final Property isEventRelatedTo = m_model.createProperty( NS + "isEventRelatedTo" );
    
    public static final Property hasPart = m_model.createProperty( NS + "hasPart" );
    
    public static final Property hasSite = m_model.createProperty( NS + "hasSite" );
    
    public static final Property hasSubEvent = m_model.createProperty( NS + "hasSubEvent" );
    
    public static final Property hasTopic = m_model.createProperty( NS + "hasTopic" );
    
    public static final Property holdsRole = m_model.createProperty( NS + "holdsRole" );
    
    public static final Property inAffiliationDuringEvent = m_model.createProperty( NS + "inAffiliationDuringEvent" );
    
    public static final Property isAddressOf = m_model.createProperty( NS + "isAddressOf" );
    
    public static final Property isAffiliationOf = m_model.createProperty( NS + "isAffiliationOf" );
    
    public static final Property isDocumentRelatedTo = m_model.createProperty( NS + "isDocumentRelatedTo" );
    
    public static final Property isFirstItemOf = m_model.createProperty( NS + "isFirstItemOf" );
    
    public static final Property isHeldBy = m_model.createProperty( NS + "isHeldBy" );
    
    public static final Property isItemOf = m_model.createProperty( NS + "isItemOf" );
    
    public static final Property isLastItemOf = m_model.createProperty( NS + "isLastItemOf" );
    
    public static final Property isLocationFor = m_model.createProperty( NS + "isLocationFor" );
    
    public static final Property isPartOf = m_model.createProperty( NS + "isPartOf" );
    
    public static final Property isSiteOf = m_model.createProperty( NS + "isSiteOf" );
    
    public static final Property isSubEventOf = m_model.createProperty( NS + "isSubEventOf" );
    
    public static final Property isTopicOf = m_model.createProperty( NS + "isTopicOf" );
    
    public static final Property keyword = m_model.createProperty( NS + "keyword" );
    
    public static final Property name = m_model.createProperty( NS + "name" );
    
    public static final Property next = m_model.createProperty( NS + "next" );
    
    public static final Property previous = m_model.createProperty( NS + "previous" );
    
    public static final Property relatesToDocument = m_model.createProperty( NS + "relatesToDocument" );
    
    public static final Property startDate = m_model.createProperty( NS + "startDate" );
    
    public static final Property title = m_model.createProperty( NS + "title" );
    
    public static final Property withOrganisation = m_model.createProperty( NS + "withOrganisation" );
    
    public static final Property withRole = m_model.createProperty( NS + "withRole" );
    
    public static final Resource Abstract = m_model.createResource( NS + "Abstract" );
    
    public static final Resource AcademicEvent = m_model.createResource( NS + "AcademicEvent" );
    
    public static final Resource Address = m_model.createResource( NS + "Address" );
    
    public static final Resource AffiliationDuringEvent = m_model.createResource( NS + "AffiliationDuringEvent" );
    
    public static final Resource AffiliationRole = m_model.createResource( NS + "AffiliationRole" );
    
    public static final Resource Agent = m_model.createResource( NS + "Agent" );
    
    public static final Resource Break = m_model.createResource( NS + "Break" );
    
    public static final Resource Conference = m_model.createResource( NS + "Conference" );
    
    public static final Resource Document = m_model.createResource( NS + "Document" );
    
    public static final Resource InProceedings = m_model.createResource( NS + "InProceedings" );
    
    public static final Resource List = m_model.createResource( NS + "List" );
    
    public static final Resource ListItem = m_model.createResource( NS + "ListItem" );
    
    public static final Resource Meal = m_model.createResource( NS + "Meal" );
    
    public static final Resource NonAcademicEvent = m_model.createResource( NS + "NonAcademicEvent" );
    
    public static final Resource Organisation = m_model.createResource( NS + "Organisation" );
    
    public static final Resource OrganisationalRoleDuringEvent = m_model.createResource( NS + "OrganisationalRoleDuringEvent" );
    
    public static final Resource OrganisedEvent = m_model.createResource( NS + "OrganisedEvent" );
    
    public static final Resource OrganisingRole = m_model.createResource( NS + "OrganisingRole" );
    
    public static final Resource Panel = m_model.createResource( NS + "Panel" );
    
    public static final Resource Person = m_model.createResource( NS + "Person" );
    
    public static final Resource Proceedings = m_model.createResource( NS + "Proceedings" );
    
    public static final Resource PublishingRole = m_model.createResource( NS + "PublishingRole" );
    
    public static final Resource PublishingRoleDuringEvent = m_model.createResource( NS + "PublishingRoleDuringEvent" );
    
    public static final Resource Role = m_model.createResource( NS + "Role" );
    
    public static final Resource RoleDuringEvent = m_model.createResource( NS + "RoleDuringEvent" );
    
    public static final Resource Session = m_model.createResource( NS + "Session" );
    
    public static final Resource Site = m_model.createResource( NS + "Site" );
    
    public static final Resource SocialEvent = m_model.createResource( NS + "SocialEvent" );
    
    public static final Resource Talk = m_model.createResource( NS + "Talk" );
    
    public static final Resource TimeIndexedSituation = m_model.createResource( NS + "TimeIndexedSituation" );
    
    public static final Resource Topic = m_model.createResource( NS + "Topic" );
    
    public static final Resource Track = m_model.createResource( NS + "Track" );
    
    public static final Resource Tutorial = m_model.createResource( NS + "Tutorial" );
    
    public static final Resource Workshop = m_model.createResource( NS + "Workshop" );
    
    public static final Resource author = m_model.createResource( "http://www.scholarlydata.org/resource/author" );
    
    public static final Resource chair = m_model.createResource( "http://www.scholarlydata.org/resource/chair" );
    
    public static final Resource challenge_chair = m_model.createResource( "http://www.scholarlydata.org/resource/challenge-chair" );
    
    public static final Resource demos_chair = m_model.createResource( "http://www.scholarlydata.org/resource/demos-chair" );
    
    public static final Resource exhibition_chair = m_model.createResource( "http://www.scholarlydata.org/resource/exhibition-chair" );
    
    public static final Resource fellowship_chair = m_model.createResource( "http://www.scholarlydata.org/resource/fellowship-chair" );
    
    public static final Resource general_chair = m_model.createResource( "http://www.scholarlydata.org/resource/general-chair" );
    
    public static final Resource industry_chair = m_model.createResource( "http://www.scholarlydata.org/resource/industry-chair" );
    
    public static final Resource local_organiser = m_model.createResource( "http://www.scholarlydata.org/resource/local-organiser" );
    
    public static final Resource metadata_coordinator = m_model.createResource( "http://www.scholarlydata.org/resource/metadata-coordinator" );
    
    public static final Resource organising_committee_member = m_model.createResource( "http://www.scholarlydata.org/resource/organising-committee-member" );
    
    public static final Resource panel_chair = m_model.createResource( "http://www.scholarlydata.org/resource/panel-chair" );
    
    public static final Resource participant = m_model.createResource( "http://www.scholarlydata.org/resource/participant" );
    
    public static final Resource phd_symposium_chair = m_model.createResource( "http://www.scholarlydata.org/resource/phd-symposium-chair" );
    
    public static final Resource poster_chair = m_model.createResource( "http://www.scholarlydata.org/resource/poster-chair" );
    
    public static final Resource posters_chair = m_model.createResource( "http://www.scholarlydata.org/resource/posters-chair" );
    
    public static final Resource presenter = m_model.createResource( "http://www.scholarlydata.org/resource/presenter" );
    
    public static final Resource proceedings_chair = m_model.createResource( "http://www.scholarlydata.org/resource/proceedings-chair" );
    
    public static final Resource programme_chair = m_model.createResource( "http://www.scholarlydata.org/resource/programme-chair" );
    
    public static final Resource programme_committee_member = m_model.createResource( "http://www.scholarlydata.org/resource/programme-committee-member" );
    
    public static final Resource publicity_chair = m_model.createResource( "http://www.scholarlydata.org/resource/publicity-chair" );
    
    public static final Resource reviewer = m_model.createResource( "http://www.scholarlydata.org/resource/reviewer" );
    
    public static final Resource session_chair = m_model.createResource( "http://www.scholarlydata.org/resource/session-chair" );
    
    public static final Resource sponsor = m_model.createResource( "http://www.scholarlydata.org/resource/sponsor" );
    
    public static final Resource sponsorship_chair = m_model.createResource( "http://www.scholarlydata.org/resource/sponsorship-chair" );
    
    public static final Resource track_chair = m_model.createResource( "http://www.scholarlydata.org/resource/track-chair" );
    
    public static final Resource treasurer = m_model.createResource( "http://www.scholarlydata.org/resource/treasurer" );
    
    public static final Resource tutorials_chair = m_model.createResource( "http://www.scholarlydata.org/resource/tutorials-chair" );
    
    public static final Resource volunteers_chair = m_model.createResource( "http://www.scholarlydata.org/resource/volunteers-chair" );
    
    public static final Resource webmaster = m_model.createResource( "http://www.scholarlydata.org/resource/webmaster" );
    
    public static final Resource workshop_organiser = m_model.createResource( "http://www.scholarlydata.org/resource/workshop-organiser" );
    
    public static final Resource workshops_chair = m_model.createResource( "http://www.scholarlydata.org/resource/workshops-chair" );
    
}
