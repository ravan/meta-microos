SUMMARY = "VSS/VDS to SVG converter"
DESCRIPTION = "Tools to convert Visio Documents (VSD) or Stencils (VSS) to SVG."
LICENSE = "GPL-2.0-only"

PV = "0.5.5"

RPM_NAME = "visio2svg-conv-0.5.5-3.24.aarch64.rpm"
RPM_HASH = "55f790a7268501869e761d48e16e75fc868e506e92fd8c298ff9bdfadf75d91f431ec6c1b63504200b756a5af9b7406b7ee853c5b9944229d7745e253821a9a8"

RPROVIDES:${PN} += "visio2svg-conv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libVisio2Svg.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvisio2svg0"

inherit rpm
