SUMMARY = "XSL Stylesheets for DocBook 4"
DESCRIPTION = "These are the XSL stylesheets for DocBook XML and 'Simplified' DocBook \
DTDs. Use these stylesheets for documents based on DocBook 4 and \
earlier; they are not aware of the namespace feature. \
 \
The stylesheets transform DocBook 4 documents into HTML, XHTML, Manpages, \
XSL-FO (for PDF), and a few other formats. \
 \
XSL is a standard W3C stylesheet language for both print and online \
rendering. For more information about XSL, see the XSL page at the W3C: \
http://www.w3.org/Style/XSL/"
LICENSE = "MIT & MPL-1.1"

PV = "1.79.2.2"

RPM_NAME = "docbook-xsl-stylesheets-1.79.2.2-2.7.noarch.rpm"
RPM_HASH = "15a4be16f83ba20393ad2c7a7d80301eefef1f9884ef04644c6cbec3a727c392f1a847bae0499263bf963c3b4fd183a4a87c34788ed61370e66f8a28b5778157"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-docbook-xsl-stylesheets \
docbook-xsl-stylesheets"

RDEPENDS:${PN} += "/usr/bin/sh \
docbook-4 \
sgml-skel \
xmlcharent"

inherit rpm
