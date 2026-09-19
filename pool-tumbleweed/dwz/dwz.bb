SUMMARY = "DWARF optimization and duplicate removal tool"
DESCRIPTION = "dwz optimizes DWARF debugging information contained in ELF shared \
libraries and executables for size, by replacing DWARF information \
representation with equivalent smaller representation where possible, \
and by reducing the amount of duplication using techniques from the \
DWARF standard appendix E - creating DW_TAG_partial_unit compilation \
units (CUs) for duplicated information and using DW_TAG_imported_unit \
to import it into each CU that needs it. \
 \
The tool handles DWARF 32-bit format debugging sections of versions \
2, 3 and 4 and GNU extensions on top of those, though using DWARF 4 \
or worst case DWARF 3 is strongly recommended. \
 \
When not using the -m option (multifile mode), GDB CVS snapshot (soon to be \
7.5) is sufficient, when using -m option, GDB from a git branch \
http://sources.redhat.com/git/?p=archer.git;a=shortlog;h=refs/heads/archer-tromey-dwz-multifile \
is needed."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.15"

RPM_NAME = "dwz-0.15-6.6.aarch64.rpm"
RPM_HASH = "e89425bcac83b82f9e4c85e7b1b6e02f874e4e5f2c79abb516c15a7ab67816c3e14b3c78a28132c3f5c93327d823a436953d1d51d8bdd62fd4da91c430151af5"

RPROVIDES:${PN} += "dwz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libelf.so.1"

inherit rpm
