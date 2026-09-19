SUMMARY = "Coreutils Viewer"
DESCRIPTION = "This tool can be described as a Tiny Dirty Linux Only* C command that looks for coreutils basic \
commands (cp, mv, dd, tar, gzip/gunzip, cat, ...) currently running on your system and displays \
the percentage of copied data. \
 \
It can now also display an estimated throughput (using -w flag)."
LICENSE = "GPL-3.0-or-later"

PV = "0.17"

RPM_NAME = "progress-0.17-1.11.aarch64.rpm"
RPM_HASH = "9e0d59546c30f41eb3847800c00163308bc661d6899bf7508d6263aec6fe2c6a31397c2e35dc80bc8143bd143b31bdfd50cf291e4e8aeabb43fc4ed16ec336e4"

RPROVIDES:${PN} += "cv \
progress"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
