SUMMARY = "Mifare Classic Offline Cracker: key recovery tool for MC cards"
DESCRIPTION = "MFOC is a tool to recover keys from Mifare Classic cards."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.7+git38"

RPM_NAME = "mfoc-0.10.7+git38-1.25.aarch64.rpm"
RPM_HASH = "3986d3e8d3bbfe371fd867b432cedad439a7c86dff094d0e5e1bec3e16dc2d90861c7d820d09468ac0603ee1b1c8c852e329a229f2f5d62003785eb595d89efc"

RPROVIDES:${PN} += "mfoc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnfc.so.6"

inherit rpm
