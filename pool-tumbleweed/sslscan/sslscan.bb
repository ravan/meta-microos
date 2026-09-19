SUMMARY = "SSL cipher scanning tool"
DESCRIPTION = "SSLScan determines what ciphers are supported on SSL-based services, \
such as HTTPS. Furthermore, SSLScan will determine the preferred \
ciphers of the SSL service."
LICENSE = "SUSE-GPL-3.0+-with-openssl-exception"

PV = "2.2.2"

RPM_NAME = "sslscan-2.2.2-1.3.aarch64.rpm"
RPM_HASH = "309be2f5a71a8318f74efafee22835f059186fbdb67538b18195496f182c96e6b1206257068fa6085454395cb10a03b9f2458d1d49938e95e0dbca52413d7722"

RPROVIDES:${PN} += "sslscan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
