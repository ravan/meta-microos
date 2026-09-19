SUMMARY = "Documentation for the GEGL 'Generic Graphics Library'"
DESCRIPTION = "GEGL provides infrastructure to do demand based cached non destructive \
image editing on larger than RAM buffers. Through babl, it provides \
support for a wide range of color models and pixel storage formats for \
input and output."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.4.72"

RPM_NAME = "gegl-doc-0.4.72-1.1.aarch64.rpm"
RPM_HASH = "58fe28864feb7734db0d85da96de969224d1af2f5e9ba328151b8f339977391869f5571b64805d3bd7d6719737de1b16c26417f855aa93fd17b868e2ae24a8b9"

RPROVIDES:${PN} += "gegl-doc"

RDEPENDS:${PN} += ""

inherit rpm
