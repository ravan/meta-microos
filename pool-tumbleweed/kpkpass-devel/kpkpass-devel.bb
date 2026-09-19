SUMMARY = "Development files for kpkpass"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to build programs that use the kpkpass library."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kpkpass-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "1ff7f7c6de04f494fa425bea092ae6844dd0be43e93d2ddaeb67e1230ec9a5155780cf6c862d3e96f538abb5227d8c1a09b61f7b5ca45949121cb4952a2ad242"

RPROVIDES:${PN} += "cmake-KPim6PkPass \
kpkpass-devel"

RDEPENDS:${PN} += "cmake-KF6Archive \
libKPim6PkPass6"

inherit rpm
