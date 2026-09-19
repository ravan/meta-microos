SUMMARY = "A set of coordinated grotesque corporate fonts"
DESCRIPTION = " \
IBM Plex is a typeface superfamily to reflect the design principles \
of IBM and to be used for all brand material across the company \
internationally."
LICENSE = "OFL-1.1"

PV = "6.4.0"

RPM_NAME = "ibm-plex-fonts-6.4.0-1.4.noarch.rpm"
RPM_HASH = "1a1c9ef265baa1e94d057bdf400de14dc286c1c7ead0f87030d7d94f3cc5c3ad2c2a203ac4e506f4a4a2add1c24c4029cafa560139788a5bc55c8dc32703f4e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibm-plex-fonts"

RDEPENDS:${PN} += "aaa-base \
coreutils \
ibm-plex-mono-fonts \
ibm-plex-sans-arabic-fonts \
ibm-plex-sans-condensed-fonts \
ibm-plex-sans-devanagari-fonts \
ibm-plex-sans-fonts \
ibm-plex-sans-hebrew-fonts \
ibm-plex-sans-kr-fonts \
ibm-plex-sans-thai-fonts \
ibm-plex-sans-thai-looped-fonts \
ibm-plex-serif-fonts \
perl"

inherit rpm
