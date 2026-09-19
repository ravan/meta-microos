SUMMARY = "Command-line tools for libdisplay-info"
DESCRIPTION = "libdisplay-info is an EDID and DisplayID library. It provides a \
low-level API exposing all of the details of these formats, plus a \
high-level API (of opinionated functions) which abstracts these \
details for common operations. \
 \
This package contains a tool to parse EDID."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "libdisplay-info-tools-0.3.0-2.5.aarch64.rpm"
RPM_HASH = "b609dff5b24bd767d876fbaff8350d29715d32b939934d9f276b7acfa1f1d7bf63f3ea5e1a324d25a00815d7d11ca52a2f793abf86ec94a18eb9660588f32808"

RPROVIDES:${PN} += "libdisplay-info-devel-/usr/bin/di-edid-decode \
libdisplay-info-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdisplay-info.so.3 \
libdisplay-info3 \
libm.so.6"

inherit rpm
