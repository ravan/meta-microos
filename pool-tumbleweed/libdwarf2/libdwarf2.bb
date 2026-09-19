SUMMARY = "Library to access DWARF information in object files"
DESCRIPTION = "Library of functions to provide creation of DWARF debugging \
information records, DWARF line number information, DWARF address \
range and pubnames information, weak names information, and DWARF \
frame description information."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.2"

RPM_NAME = "libdwarf2-2.3.2-1.2.aarch64.rpm"
RPM_HASH = "81ac44add800761d271179e158565c8aec194597159a720035b3501bf32936875adf8ebaf56fcac7795412d8f408387443422f0cc40bf10f3cde06ad0162a297"

RPROVIDES:${PN} += "libdwarf.so.2 \
libdwarf2 \
libdwarfp.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
