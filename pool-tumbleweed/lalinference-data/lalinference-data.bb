SUMMARY = "Data files for lalinference"
DESCRIPTION = "This package provides the data files for lalinference."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.9"

RPM_NAME = "lalinference-data-4.1.9-3.1.noarch.rpm"
RPM_HASH = "14934e9275baafeb4beffcf3f456c102f019d3a3a7a6f841877fb43e6ae84fcfca19a515d4d8c8ffbbbbc1e88adc70360fd414573636078cd03814bec2b1492b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lalinference-data \
python313-lalinference-data \
python314-lalinference-data"

RDEPENDS:${PN} += ""

inherit rpm
