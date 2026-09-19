SUMMARY = "Small Device C Compiler"
DESCRIPTION = "SDCC is a C compiler for 8051 class and similar microcontrollers. \
The package includes the compiler, assemblers and linkers, a device \
simulator and a core library. The processors supported (to a varying \
degree) include the 8051, ds390, z80, hc08, and PIC."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.5.0"

RPM_NAME = "sdcc-4.5.0-2.5.aarch64.rpm"
RPM_HASH = "057c91baa60140052151140310f2666bd95548d25963bec7052c870aa90d6ef59c285f815867d74c67d8a2f76b00d65685851223dc7596ba0f33b7b5fe9634bb"

RPROVIDES:${PN} += "sdcc"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
