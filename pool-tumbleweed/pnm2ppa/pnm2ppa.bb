SUMMARY = "HP PPA GhostScript filter"
DESCRIPTION = "pnm2ppa is a Ghostscript print filter which allows owners of HP DeskJet \
710C, 712C, 720C, 722C, 820Cse, 820Cxi, 1000Cse, or 1000Cxi printers to \
print PostScript Level 2."
LICENSE = "GPL-2.0-or-later"

PV = "1.13"

RPM_NAME = "pnm2ppa-1.13-3.5.aarch64.rpm"
RPM_HASH = "4720c15ffbd2f9c6f6486379361ec53f68f1c428554463a100eb73f7ce0dbd622471c77c16ab8b747721dd2a8308d8a83a485fd43b960c07fee150a5174c8098"

RPROVIDES:${PN} += "config-pnm2ppa \
pnm2ppa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
