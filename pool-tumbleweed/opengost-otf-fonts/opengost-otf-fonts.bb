SUMMARY = "Open-source Russian GOST Fonts (OpenType Format)"
DESCRIPTION = "Open-source version of the fonts by Russian standard GOST 2.304-81 \
«Letters for drawings». \
 \
This package contains fonts in OpenType format."
LICENSE = "OFL-1.1"

PV = "0.3"

RPM_NAME = "opengost-otf-fonts-0.3-7.26.noarch.rpm"
RPM_HASH = "700249830c0dba8ff95eec5cb1cea1325971838b28a9ba98206ad03217cd2f7daf4638f816b10d0960ed950451b3e250625816ae1bb130e298cee6bbae1fef8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opengost-otf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
