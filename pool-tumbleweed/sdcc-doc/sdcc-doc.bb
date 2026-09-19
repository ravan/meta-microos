SUMMARY = "Documentation for the SDCC C compiler"
DESCRIPTION = "SDCC is a C compiler for 8051 class and similar microcontrollers. \
The package includes the compiler, assemblers and linkers, a device \
simulator and a core library. The processors supported (to a varying \
degree) include the 8051, ds390, z80, hc08, and PIC. \
 \
This package contains documentation for SDCC C compiler."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.5.0"

RPM_NAME = "sdcc-doc-4.5.0-2.5.noarch.rpm"
RPM_HASH = "d3174f150f7768951699506efe4ab5a0511ed1e941338422be89481803157bcaddc9008ad0e8b2fb905f34b896dcfb3a6ca4ddb2f9a56738618bd99d56f006c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sdcc-doc"

RDEPENDS:${PN} += ""

inherit rpm
