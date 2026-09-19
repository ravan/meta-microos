SUMMARY = "Development files for libxmp, a MOD/S3M/IT/etc. module player library"
DESCRIPTION = "libxmp is a module player library which supports many module formats, \
including MOD, S3M and IT. Possible applications for libxmp include \
standalone module players, module player plugins for other players, \
module information extractors, background music replayers for games \
and other applications, converters, etc. \
 \
This subpackage contains headers and library development files for \
libxmp."
LICENSE = "MIT"

PV = "4.7.3"

RPM_NAME = "libxmp-devel-4.7.3-1.1.aarch64.rpm"
RPM_HASH = "aa44451f2260909ffeb3f8073e7c4e0ef7bdcfdb3bd8ae16cc37c89f61a9e9934f5fe8b6af059f79da608e474d0010fe715213438eb2070db970f7d3aa6dd25e"

RPROVIDES:${PN} += "libxmp-devel \
pkgconfig-libxmp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxmp4"

inherit rpm
