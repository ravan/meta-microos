SUMMARY = "IBM Plex Sans Condensed"
DESCRIPTION = " \
IBM Plex is a typeface superfamily to reflect the design principles \
of IBM and to be used for all brand material across the company \
internationally. \
 \
This package provides IBM Plex Sans Condensed."
LICENSE = "OFL-1.1"

PV = "6.4.0"

RPM_NAME = "ibm-plex-sans-condensed-fonts-6.4.0-1.4.noarch.rpm"
RPM_HASH = "a824bd6f9d7fa56a110f094c312010191a72576ced0d132f675ee80fd89fcf94de361258dca12f31dbef0e2ab1d8f7ed8d5213a8ed1282cee38da0233d7c6dcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibm-plex-sans-condensed-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
