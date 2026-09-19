SUMMARY = "File viewer and pager"
DESCRIPTION = "Most is a paging program. \
It supports multiple windows and can scroll left and right."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "most-5.2.0-1.16.aarch64.rpm"
RPM_HASH = "18e25017b09e37cacc351a8bb125544b88a402625266dcd354a3abda1fb95d6170448f99c3e8ec1f6b7c402cd9a320d3e05e4ccec5ceb192369205550b2908ff"

RPROVIDES:${PN} += "most"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libslang.so.2"

inherit rpm
