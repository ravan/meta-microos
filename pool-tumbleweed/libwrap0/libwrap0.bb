SUMMARY = "The TCP wrapper library"
DESCRIPTION = "This package contains a library which implements classifying incoming \
requests (connections) based upon rule exclusion files (/etc/hosts.*)."
LICENSE = "BSD-3-Clause"

PV = "7.6"

RPM_NAME = "libwrap0-7.6-901.6.aarch64.rpm"
RPM_HASH = "4ccc2e369ac1e827450d8d806857b216bab6fb4b534d48e279b38699d3c5fa6534d78033c7cd24823d6aecd5414029257dfb66c6076bd6d1d6d207ee29bb53a8"

RPROVIDES:${PN} += "config-libwrap0 \
libwrap.so.0 \
libwrap0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
