SUMMARY = "Thai word segmentation utility"
DESCRIPTION = "Thai word segmentation utility."
LICENSE = "BSD-3-Clause"

PV = "0.5.1b2"

RPM_NAME = "wordcut-0.5.1b2-207.9.aarch64.rpm"
RPM_HASH = "60191d00d9925dc9b890f4630ed60322d6464472363f8c044e7a6bf87b6332dbedd0fd19e3ae4fc322521d4ec6bc2d179f8a7b815bae3a96da7d94cee8020112"

RPROVIDES:${PN} += "locale-th \
wordcut"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwordcut.so.0"

inherit rpm
