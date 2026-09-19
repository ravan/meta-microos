SUMMARY = "Small Wrapper Scripts for Processing DocBook Files"
DESCRIPTION = "The docbook-utils package is a set of a few small programs intended to \
ease everyday use of technical documentation software based on the \
DocBook DTD, either written in SGML or XML. \
 \
Tasks they currently accomplish are: * jw: convert SGML files to \
   other formats (HTML, RTF, PostScript, PDF) \
 \
* sgmldiff: detect the differences in markup between two SGML files"
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.15"

RPM_NAME = "docbook-utils-0.6.15-1.1.noarch.rpm"
RPM_HASH = "1b185cb76c7fa8e2cc14d140f048f82d22a869a91686cac23b72979365193f1d86ad2421fc64a0c106940d3b980f02eb8cbea1296faef4329e50bcbdf02f06e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docbook-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
docbook-utils-minimal \
texlive-jadetex"

inherit rpm
