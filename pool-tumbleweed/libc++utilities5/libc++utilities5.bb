SUMMARY = "Common C++ classes and routines"
DESCRIPTION = "Common C++ classes and routines such as argument parser, IO and conversion utilities."
LICENSE = "GPL-2.0-or-later"

PV = "5.34.2"

RPM_NAME = "libc++utilities5-5.34.2-1.2.aarch64.rpm"
RPM_HASH = "921b3fc2846867fab590615a5d57766c34afb95b960dcf83544f215a2ea4406eadbdf848092eea8b728e0bf16b55308b3f566dddd4815d69687a54234013de01"

RPROVIDES:${PN} += "libc++utilities.so.5 \
libc++utilities5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
