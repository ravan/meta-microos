SUMMARY = "Image handling and conversion library"
DESCRIPTION = "Imlib2 is an advanced replacement library for libraries like libXpm \
that provides many more features with much greater flexibility and \
speed than standard libraries, including font rasterization, rotation, \
RGBA space rendering and blending, dynamic binary filters, scripting, \
and more."
LICENSE = "BSD-3-Clause"

PV = "1.12.7"

RPM_NAME = "imlib2-1.12.7-1.1.aarch64.rpm"
RPM_HASH = "e9f27718bd32016a921bfcd1e70422967633bc8c6b4579c57ee052826cc1da8a25361fc9eac705e44dd51834c0c251d0f47fce8094cd02d9b794948bb0ca872a"

RPROVIDES:${PN} += "imlib2"

RDEPENDS:${PN} += ""

inherit rpm
