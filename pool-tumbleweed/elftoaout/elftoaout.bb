SUMMARY = "Utility for converting ELF binaries to a.out"
DESCRIPTION = "The elftoaout utility converts a static ELF binary to a static a.out \
binary.  If you are using an ELF system on a SPARC, you will need to \
run elftoaout on the kernel image so that the SPARC PROM can boot the \
image."
LICENSE = "GPL-2.0+"

PV = "2.3"

RPM_NAME = "elftoaout-2.3-19.36.aarch64.rpm"
RPM_HASH = "d9c7bddcce8759a0eabac6bed32866523f785ff10201876d2cdca5e946c9b7b49d8ae1c08becc040a0f7da8506f770954942f0b39d30eb315aef143766cc4423"

RPROVIDES:${PN} += "elftoaout"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
