SUMMARY = "Terminal file manager (with sixel support)"
DESCRIPTION = "lf (as in 'list files') is a terminal file manager written in Go with a \
heavy inspiration from ranger file manager"
LICENSE = "MIT"

PV = "34"

RPM_NAME = "lf-34-1.10.aarch64.rpm"
RPM_HASH = "3b46a964ae8f0efee0d989c8ff22bb46469e50ebf0a5220b744298745ae15f4a1dd572722909e82b32806e85fc416a2e3b08e1ce3c4a5a262f849dd259063eab"

RPROVIDES:${PN} += "lf"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
