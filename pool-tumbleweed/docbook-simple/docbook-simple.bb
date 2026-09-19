SUMMARY = "Simple DocBook DTD and Documentation"
DESCRIPTION = "This package contains the Simple DocBook DTD."
LICENSE = "HPND"

PV = "1.1"

RPM_NAME = "docbook-simple-1.1-1.14.noarch.rpm"
RPM_HASH = "aede6cff3258b88242daba7ee84f11964522b60ec6e587cbcfea342ce0806a3a53e9ae89c4bac7ee1e668cbd8986654dd2bfa5adbe4b1eac9e5a0a0448e22b3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docbook-simple"

RDEPENDS:${PN} += "/usr/bin/install-catalog \
/usr/bin/sh \
/usr/bin/xmlcatalog \
libxml2-tools \
sgml-skel"

inherit rpm
