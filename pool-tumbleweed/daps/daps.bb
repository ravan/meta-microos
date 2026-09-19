SUMMARY = "DocBook Authoring and Publishing Suite"
DESCRIPTION = "DocBook Authoring and Publishing Suite (DAPS) \
 \
DAPS contains a set of stylesheets, scripts and makefiles that enable \
you to create HTML, PDF, EPUB and other formats from DocBook XML with a \
single command. It also contains tools to generate profiled source \
tarballs for distributing your XML sources for translation or review. \
 \
DAPS also includes tools that assist you when writing DocBook XML: \
validator, link checker, spellchecker, editor macros and stylesheets for \
converting DocBook XML."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.3.2"

RPM_NAME = "daps-3.3.2-1.14.noarch.rpm"
RPM_HASH = "7f9119226ccc3901db39c6c92fe1052580463efe369c59c0014656333c6cbca6e0e9a84912630b28a9237854ef62421b5f9e9928178f0d6194f37298b06e1ba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-daps \
daps"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
ImageMagick \
bash \
dia \
docbook-4 \
docbook-5 \
docbook-xsl-stylesheets \
docbook5-xsl-stylesheets \
inkscape \
java \
jing \
libxml2 \
libxslt \
make \
poppler-tools \
python3-lxml \
rubygem-ruby-4.0.0-asciidoctor \
sgml-skel \
suse-xsl-stylesheets \
svg-schema \
xerces-j2 \
xml-apis \
xmlgraphics-fop \
xmlstarlet \
zip"

inherit rpm
