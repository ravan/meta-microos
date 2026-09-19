SUMMARY = "Files for Developing with ucpp"
DESCRIPTION = "Includes and definitions for developing with the ucpp library."
LICENSE = "BSD-3-Clause"

PV = "1.3.5"

RPM_NAME = "ucpp-devel-1.3.5-2.29.aarch64.rpm"
RPM_HASH = "52c6ee040fd230d8a6e7adbcff8311405e6cec41e1e90937939e0fc2384b8a86f66881c6e4d48c1182606ccc791a5aae2a700e7716338a6c85eb940bd6dc5aef"

RPROVIDES:${PN} += "pkgconfig-libucpp \
ucpp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libucpp13"

inherit rpm
