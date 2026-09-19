SUMMARY = "Helper Scripts for the SGML System"
DESCRIPTION = "These scripts will help prepare and maintain parts of an SGML system."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.2"

RPM_NAME = "sgml-skel-0.7.2-2.2.noarch.rpm"
RPM_HASH = "d6cbd17b1f8ab34d0c33589b1784f76a2181d8c227afe242d3c32eacb158303d60710517ebe44a88be27f86a6cdd12b3a76de21914614d7f9f99077bf8dd6c07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-sgml-skel \
sgml-skel"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/sh \
bash \
coreutils \
findutils \
libxml2-tools \
libxslt-tools \
sed"

inherit rpm
