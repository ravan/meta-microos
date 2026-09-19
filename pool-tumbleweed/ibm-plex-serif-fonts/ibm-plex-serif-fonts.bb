SUMMARY = "IBM Plex Serif"
DESCRIPTION = " \
IBM Plex is a typeface superfamily to reflect the design principles \
of IBM and to be used for all brand material across the company \
internationally. \
 \
 \
Plex Serif is a transitional serif typeface with a design that was \
inspired by Bodoni and Janson. Some of Bodoni's features such as ball \
terminals and rectangular serifs are used in Plex Serif."
LICENSE = "OFL-1.1"

PV = "6.4.0"

RPM_NAME = "ibm-plex-serif-fonts-6.4.0-1.4.noarch.rpm"
RPM_HASH = "016f03e42d48f928a2cae77e5ea0d37cb1321221911e5a51e23e8c34f83755d8df8a29cf069613c46f03afc27f2f9c1d23ce16675e71adf6bbcba1d13d57abf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibm-plex-serif-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
