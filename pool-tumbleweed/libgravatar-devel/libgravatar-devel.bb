SUMMARY = "Development package for libgravatar"
DESCRIPTION = "The development package for the libgravatar library."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libgravatar-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "5406e26dd8c83ba88895b8c6a8c73b72437c8b5d87f775756030c1e6c8c2852b5bdd306534beb42dd4707d02636a1e78d552d3504309d8fe92692cd689c0e8f0"

RPROVIDES:${PN} += "cmake-KPim6Gravatar \
libgravatar-devel"

RDEPENDS:${PN} += "libKPim6Gravatar6"

inherit rpm
