SUMMARY = "Overpass Mono typeface"
DESCRIPTION = "Overpass is a (sans-serif) font family inspired by Highway Gothic. \
 \
This package contains the monospace variants in OpenType format."
LICENSE = "OFL-1.1"

PV = "3.0.5"

RPM_NAME = "redhat-overpass-mono-fonts-3.0.5-2.9.noarch.rpm"
RPM_HASH = "6457c70cd6f79b731be421c2d49c74cff231fd00539d6279db29662aba7daaf4c2c530b8e77122e848dc4edb25acc4991cf9dd1323ec821943b51f687482bc29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "redhat-overpass-mono-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
