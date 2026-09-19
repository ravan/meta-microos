SUMMARY = "DocBook Tools"
DESCRIPTION = "A shell script to convert SGML documents based on the DocBook DTD. \
 \
For usage information read: \
 \
/usr/share/doc/packages/docbook-toys/README"
LICENSE = "GPL-2.0-or-later"

PV = "1.51.0"

RPM_NAME = "docbook-toys-1.51.0-439.9.noarch.rpm"
RPM_HASH = "f651b33ece9fffb1d777b8d26368d8e98175128ab890220ed96f01b9e0d5036d160aac0022ca2f9e5f8e37b28b6fadaeb0dc092d3f09020cce525a0f8a6d7809"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-docbook-toys \
docbook-tools \
docbook-toys"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
docbook-3 \
docbook-4 \
docbook-dsssl-stylesheets \
iso-ent \
openjade \
texlive-jadetex"

inherit rpm
