SUMMARY = "IBM Plex Sans Thai"
DESCRIPTION = " \
IBM Plex is a typeface superfamily to reflect the design principles \
of IBM and to be used for all brand material across the company \
internationally. \
 \
This package provides IBM Plex Sans Thai."
LICENSE = "OFL-1.1"

PV = "6.4.0"

RPM_NAME = "ibm-plex-sans-thai-fonts-6.4.0-1.4.noarch.rpm"
RPM_HASH = "a040abc5bb485c5fe3cabbcbbb8326476dfb839e2bc18b238c625a847e498855c875667b3fac9c11161ffd7b665454383f60ac8730cb8a304619f3c66ad647e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibm-plex-sans-thai-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
