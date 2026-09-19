SUMMARY = "Spatial SQLite extension"
DESCRIPTION = "The SpatiaLite extension enables SQLite to support spatial data too \
[aka GEOMETRY], in a way conformant to OpenGis specifications."
LICENSE = "MPL-1.1"

PV = "5.1.0"

RPM_NAME = "mod_spatialite-5.1.0-1.14.aarch64.rpm"
RPM_HASH = "9b5025f2d99caadcb45eef6efc32821c5738e95c8b59494c1469201d1c12e3e0f70cabc86a0ec23af173f53c6a373f1c9d2d646677a50e06a5eecec2fbe9569c"

RPROVIDES:${PN} += "mod-spatialite"

RDEPENDS:${PN} += "libspatialite8"

inherit rpm
