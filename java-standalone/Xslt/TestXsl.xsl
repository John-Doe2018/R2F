<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:fn="http://www.w3.org/2005/xpath-functions" xmlns:xi="http://www.w3.org/2001/XInclude"
	xmlns:uuid="java:java.util.UUID">
	<!-- <xsl:preserve-space elements="*" /> -->

	<!-- <xsl:output method="xml" encoding="UTF-8" indent="yes" doctype-public="-//OASIS//DTD 
		DITA Topic//EN" doctype-system="http://localhost:8080/digipub/assets/config/DitaDtd/topic.dtd"/> -->
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />

<!-- 	<xsl:template match="html">
		<xsl:apply-templates />
	</xsl:template> -->
	<xsl:template match="html">
		<map>
				<xsl:apply-templates />
			<xsl:apply-templates />
		</map>
	</xsl:template>
	<xsl:template match="title">
		<title>
			<xsl:apply-templates />
		</title>
	</xsl:template>
	<xsl:template match="topicMetadata">
		<topicMetadata>
			<xsl:apply-templates />
		</topicMetadata>
	</xsl:template>
	<xsl:template match="shortdesc"> <xsl:element name="shortdesc"> 
		<xsl:apply-templates/> </xsl:element> </xsl:template>
		
		<xsl:template match="author"> <xsl:element name="author"> 
		<xsl:apply-templates/> </xsl:element> </xsl:template>
		
		<xsl:template match="publisher"> <xsl:element name="publisher"> 
		<xsl:apply-templates/> </xsl:element> </xsl:template>
		
		<xsl:template match="body"> <xsl:element name="topicref"> 
		<xsl:apply-templates/> </xsl:element> </xsl:template>
		
		<!-- <xsl:template match="author"> <xsl:element name="author"> 
		<xsl:apply-templates/> </xsl:element> </xsl:template>
		
		<xsl:template match="author"> <xsl:element name="author"> 
		<xsl:apply-templates/> </xsl:element> </xsl:template> -->
</xsl:stylesheet>