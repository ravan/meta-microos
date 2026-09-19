SUMMARY = "Small Device C Compiler"
DESCRIPTION = "SDCC is a C compiler for 8051 class and similar microcontrollers. \
The package includes the compiler, assemblers and linkers, a device \
simulator and a core library. The processors supported (to a varying \
degree) include the 8051, ds390, z80, hc08, and PIC. \
 \
This package contains sources for the C library and other files for \
development."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.5.0"

RPM_NAME = "sdcc-libc-sources-4.5.0-2.5.noarch.rpm"
RPM_HASH = "cc60a56dda2a04b874c190da293336c28a76454b462e784192647573d94c07f6eb50dcc63336f7db5b4fdf2ae590f3c39744ed3bd585fd0db3dbe16b2f113bd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sdcc-libc-sources"

RDEPENDS:${PN} += "/usr/bin/sh \
sdcc"

inherit rpm
