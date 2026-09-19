SUMMARY = "Tar archive filter for nbdkit"
DESCRIPTION = "This package is a tar archive filter for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.48.0"

RPM_NAME = "nbdkit-tar-filter-1.48.0-1.1.aarch64.rpm"
RPM_HASH = "025e371fbc67500613085df34be0043b6aa8ffe0fb0d170991c3d7a0e4254ac6074341b69587f4d295923c138a265c48861198cdab0bb05a35f5e9ca27e13ed1"

RPROVIDES:${PN} += "nbdkit-tar-filter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
nbdkit-server \
tar"

inherit rpm
