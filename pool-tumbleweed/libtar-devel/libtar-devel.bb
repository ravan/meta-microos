SUMMARY = "Development files for libtar"
DESCRIPTION = "libtar is a C library for manipulating POSIX tar files. It handles adding \
and extracting files to/from a tar archive. \
 \
This package contains devel files for libtar."
LICENSE = "BSD-3-Clause"

PV = "1.2.20"

RPM_NAME = "libtar-devel-1.2.20-3.3.aarch64.rpm"
RPM_HASH = "0c89a3d3314b71baab9b06b431743b79379658ff406a56a9fe029efa011e4d1339c3fc6855a67959b2b5e08e00aaef3822310f6b6bcda5171f5698d604a46925"

RPROVIDES:${PN} += "libtar-devel"

RDEPENDS:${PN} += "libtar"

inherit rpm
