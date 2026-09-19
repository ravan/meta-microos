SUMMARY = "Development headers for Boost.Nowide libraries"
DESCRIPTION = "Development headers for Boost.Nowide* boost libraries."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_nowide1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "340b4af2909cd437b6ca8e4ba76bcbac00a2598d6b8bf097babccd9a125c650ebec96335b0e85e202a566f06e579d04b197c2ee169c24fc2ab0b7f2186842b30"

RPROVIDES:${PN} += "boost-nowide-devel-impl \
libboost-nowide1-91-0-devel"

RDEPENDS:${PN} += "libboost-nowide1-91-0"

inherit rpm
