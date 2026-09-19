SUMMARY = "A code editor heavily inspired by Vim"
DESCRIPTION = "Kakoune is a code editor heavily inspired by Vim. \
It's faster as in less keystrokes, supports multiple selections and uses orthogonal design."
LICENSE = "Unlicense"

PV = "2026.05.21"

RPM_NAME = "kakoune-2026.05.21-1.3.aarch64.rpm"
RPM_HASH = "436698e36d1e61fcd08fc11f088abaa7779f5e779a01047f2a3a00d0a42523300edc01f4d5c2d74316c01f087ee161eaf3495d2ed3be29c756010a976b113eae"

RPROVIDES:${PN} += "kakoune"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
