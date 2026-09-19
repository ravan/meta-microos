SUMMARY = "Display file system space usage using graphs and colors"
DESCRIPTION = "dfc is a simple tool that displays file system space usage using graphs and \
colors."
LICENSE = "BSD-3-Clause"

PV = "3.1.1"

RPM_NAME = "dfc-3.1.1-3.11.aarch64.rpm"
RPM_HASH = "c6d0aa59f6c2d8f4300c2a08dd135cd021d5e9075b4401de583204e1343d747830129febc3c712cb7459a28058156973c37751b864279df4d594fd423d2002eb"

RPROVIDES:${PN} += "config-dfc \
dfc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
