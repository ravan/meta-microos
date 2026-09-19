SUMMARY = "TUI client for browsing Geminispace"
DESCRIPTION = "Clagrange is a TUI client for browsing Geminispace."
LICENSE = "BSD-2-Clause"

PV = "1.21.1"

RPM_NAME = "clagrange-1.21.1-1.1.aarch64.rpm"
RPM_HASH = "3e7d7a61ea44d80906cd86dd8e36121a607c75f9da7fadec97b128427a37a4c91594befb1444eac45ad43c09bd293461df6382ee7a45cb9a18707fe780109760"

RPROVIDES:${PN} += "clagrange"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libncursesw.so.6 \
libpcre2-8.so.0 \
libssl.so.3 \
libtinfo.so.6 \
libunistring.so.5 \
libz.so.1"

inherit rpm
