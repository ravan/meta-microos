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

RPM_NAME = "docbook-utils-minimal-0.6.15-1.1.noarch.rpm"
RPM_HASH = "5957e0827bda6d77dfa71b23e44097a234d99b6c4f129c68d467d096a01d2a3c41be450bbdfb644ba07b4e1a1e36febfc78149fd13b1452693bdaded69f3f70f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docbook-utils-minimal"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
docbook-3 \
docbook-4 \
docbook-dsssl-stylesheets \
iso-ent \
openjade \
opensp \
perl-SGMLS \
sgml-skel"

inherit rpm
