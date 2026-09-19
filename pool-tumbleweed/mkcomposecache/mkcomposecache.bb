SUMMARY = "Utility to create Compose cache files"
DESCRIPTION = "mkcomposecache is used for creating global (system-wide) Compose cache files. \
 \
Compose cache files help with application startup times and memory usage, \
especially in locales with large Compose tables (e.g. all UTF-8 locales)."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "mkcomposecache-1.2.3-1.3.aarch64.rpm"
RPM_HASH = "885db78955b725f92d9769c9e66cc004acb67369887e6a0eff6e88c58c37e66f30082fc1ccc5c7297d50801a8726d6c5a8e9355da9dabaa1f34c99c34e065bf9"

RPROVIDES:${PN} += "mkcomposecache"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
