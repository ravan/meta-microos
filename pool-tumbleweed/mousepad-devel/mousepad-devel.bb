SUMMARY = "Development files for Mousepad"
DESCRIPTION = "Development files for Mousepad plugin development"
LICENSE = "GPL-2.0-or-later"

PV = "0.7.0"

RPM_NAME = "mousepad-devel-0.7.0-1.2.aarch64.rpm"
RPM_HASH = "dc850fa4b18842b66c6cd09d61a65907a7b1660760688dd4d73d85ffe0d7dca17d8555c1394401fa0892791e6662abfe6ff4c2cb3d389357849a0f2dfb5767c3"

RPROVIDES:${PN} += "mousepad-devel"

RDEPENDS:${PN} += "libmousepad0"

inherit rpm
