SUMMARY = "A multi-platform, multi-architecture disassembly framework"
DESCRIPTION = "Capstone is a disassembly framework. \
disasm engine for binary analysis and reversing in the security community."
LICENSE = "BSD-3-Clause"

PV = "5.0.6"

RPM_NAME = "capstone-5.0.6-2.3.aarch64.rpm"
RPM_HASH = "89a0df860e2391044afe404b912c24acaf6789309015420f32203d521ff68760bef38f905ca1d1eed40b781716a3b4a30aa1186a3f549492c61ba5cc22c05b2b"

RPROVIDES:${PN} += "capstone"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
