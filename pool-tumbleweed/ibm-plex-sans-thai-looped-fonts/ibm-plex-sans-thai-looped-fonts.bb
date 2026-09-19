SUMMARY = "IBM Plex Sans Thai Looped"
DESCRIPTION = " \
IBM Plex is a typeface superfamily to reflect the design principles \
of IBM and to be used for all brand material across the company \
internationally. \
 \
This package provides IBM Plex Sans Thai Looped."
LICENSE = "OFL-1.1"

PV = "6.4.0"

RPM_NAME = "ibm-plex-sans-thai-looped-fonts-6.4.0-1.4.noarch.rpm"
RPM_HASH = "d5b0c168023ccf46d0b5c31ab688c76efe3cc01bcd814b237a8462aaf0bd45782bda9253585513e4362c3646bf5fee924fbb0a9e8b83ebdf0974e8f882e19560"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibm-plex-sans-thai-looped-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
