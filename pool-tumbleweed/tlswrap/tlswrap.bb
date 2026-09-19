SUMMARY = "TLS/SSL FTP wrapper/proxy"
DESCRIPTION = "TLS/SSL FTP wrapper/proxy, allowing you to use your favorite FTP client with \
any TLS/SSL-enabled FTP server."
LICENSE = "BSD-3-Clause"

PV = "1.04"

RPM_NAME = "tlswrap-1.04-4.9.aarch64.rpm"
RPM_HASH = "b52375f2200d2a3fe1ff4900e7b361a20b062ab64fabd92592b20907fe75424dc79d7ae84cee78f013bc230daa478ffc055b56a975d26c553b0023a12ee94c51"

RPROVIDES:${PN} += "tlswrap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
