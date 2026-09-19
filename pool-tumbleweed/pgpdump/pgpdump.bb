SUMMARY = "PGP packet visualizer"
DESCRIPTION = "pgpdump is a PGP packet visualizer which displays the packet format of OpenPGP \
(RFC 4880) and PGP version 2 (RFC 1991)."
LICENSE = "BSD-3-Clause"

PV = "0.36"

RPM_NAME = "pgpdump-0.36-2.5.aarch64.rpm"
RPM_HASH = "f96de4339b34ff070e5648be52e18baafa48e4502bc02c3ddb33f5677eb088fb87bf8d751ed989aca766a7371f48648ed52b1a6ec17d5039dcb0b39492dc4550"

RPROVIDES:${PN} += "pgpdump"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
