SUMMARY = "IBM Plex Sans KR"
DESCRIPTION = " \
IBM Plex is a typeface superfamily to reflect the design principles \
of IBM and to be used for all brand material across the company \
internationally. \
 \
This package provides IBM Plex Sans KR."
LICENSE = "OFL-1.1"

PV = "6.4.0"

RPM_NAME = "ibm-plex-sans-kr-fonts-6.4.0-1.4.noarch.rpm"
RPM_HASH = "ce19aa42d02926ecd05937e9fc41b141d55f556800e11069cb1cb0cc519276d82803288c076f083cf4e1fa58d6228469dbecb0b39dbadde5d8f535f054b4c79f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibm-plex-sans-kr-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
