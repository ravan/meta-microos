SUMMARY = "OASIS Darwin Information Typing Architecture (DITA)"
DESCRIPTION = "This package contains the DITA specifications, DTDs, and schemas."
LICENSE = "SUSE-Oasis-Specification-Notice"

PV = "1.1"

RPM_NAME = "dita-1.1-85.6.noarch.rpm"
RPM_HASH = "802c8fd0281cc0e544da39b9e60f961573d6733c750e2cf0f6506fea96186143309a926e2bf870a917a94cbec9f24ad3c03c24ded761425953df5f1c5026deaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dita \
dita"

RDEPENDS:${PN} += "/usr/bin/edit-xml-catalog \
/usr/bin/sgml-register-catalog \
/usr/bin/sh \
/usr/bin/xmlcatalog \
awk \
coreutils \
grep \
sed \
sgml-skel"

inherit rpm
