SUMMARY = "IBM Plex Sans Devanagari"
DESCRIPTION = " \
IBM Plex is a typeface superfamily to reflect the design principles \
of IBM and to be used for all brand material across the company \
internationally. \
 \
This package provides IBM Plex Sans Devanagari."
LICENSE = "OFL-1.1"

PV = "6.4.0"

RPM_NAME = "ibm-plex-sans-devanagari-fonts-6.4.0-1.4.noarch.rpm"
RPM_HASH = "b86126b366d7ebdbab7c7e6e4d9444a78fb53d58d651ffab8f61afa654e75dee8b1f437460dd2c5fa9682ae6e8d6e1948acd0845659a03139634d3f760c528db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibm-plex-sans-devanagari-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
