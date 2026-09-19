SUMMARY = "IBM Plex Sans Hebrew"
DESCRIPTION = " \
IBM Plex is a typeface superfamily to reflect the design principles \
of IBM and to be used for all brand material across the company \
internationally. \
 \
This package provides IBM Plex Sans Hebrew."
LICENSE = "OFL-1.1"

PV = "6.4.0"

RPM_NAME = "ibm-plex-sans-hebrew-fonts-6.4.0-1.4.noarch.rpm"
RPM_HASH = "132626a8453d8517b04589838859e0b837ececdc3bd7f81e6674aada0d0a6a851c353e4d8d9fb9f08d0a270d1dd1bdf0451a2bcbeaad2717e73b95a21157c0c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibm-plex-sans-hebrew-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
