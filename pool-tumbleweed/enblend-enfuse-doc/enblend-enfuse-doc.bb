SUMMARY = "Usage Documentation for enblend and enfuse"
DESCRIPTION = "PDF usage documentation for the enblend and enfuse command line tools."
LICENSE = "GPL-2.0-or-later"

PV = "4.2"

RPM_NAME = "enblend-enfuse-doc-4.2-7.6.aarch64.rpm"
RPM_HASH = "025f8404b3848cec3d164d7e6268dd3435f14eef674015649692fbab2d103c43a2065cb49a490586fb945d5c1ae1f1435a2201cbae1fb62ba3daf1555759ca1a"

RPROVIDES:${PN} += "enblend-enfuse-doc"

RDEPENDS:${PN} += ""

inherit rpm
