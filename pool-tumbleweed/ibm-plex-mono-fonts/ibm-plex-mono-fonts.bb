SUMMARY = "IBM Plex Mono"
DESCRIPTION = " \
IBM Plex is a typeface superfamily to reflect the design principles \
of IBM and to be used for all brand material across the company \
internationally. \
 \
 \
Plex Mono is a monospaced typeface based on Plex Sans. The italic \
design was inspired by the Italic 12 typeface used on the IBM \
Selectric typewriter."
LICENSE = "OFL-1.1"

PV = "6.4.0"

RPM_NAME = "ibm-plex-mono-fonts-6.4.0-1.4.noarch.rpm"
RPM_HASH = "aad3fab6ca91e2f233f1c3945b855596507df1d2460bdd38c73023c396497a7b9025aab7c1574693a874a174489b979cdf531cd18bd76b8bcd2e8c2dc7910f8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibm-plex-mono-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
