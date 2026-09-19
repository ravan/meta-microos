SUMMARY = "XSL Stylesheets for DocBook 5"
DESCRIPTION = "These are the XSL stylesheets for DocBook 5 XML and 'Simplified' DocBook 5. \
Use these stylesheets for documents based on DocBook 5; they are aware \
of the namespace feature. \
 \
The stylesheets transform DocBook 5 documents into HTML, XHTML, Manpages, \
XSL-FO (for PDF), and a few other formats. \
 \
XSL is a standard W3C stylesheet language for both print and online \
rendering. For more information about XSL, see the XSL page at the W3C: \
http://www.w3.org/Style/XSL/"
LICENSE = "MIT & MPL-1.1"

PV = "1.79.2.2"

RPM_NAME = "docbook5-xsl-stylesheets-1.79.2.2-2.7.noarch.rpm"
RPM_HASH = "0bbd354b17f4c4f281c49b9951d39b9169378aa339b0afb1988893694374545c52c9f6f567baab78cf036600d6ede3d0e02f6a9b207a8ea422f70f855e8b7349"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-docbook5-xsl-stylesheets \
docbook5-xsl-stylesheets"

RDEPENDS:${PN} += "/usr/bin/sh \
docbook-5 \
sgml-skel \
xmlcharent"

inherit rpm
