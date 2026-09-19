SUMMARY = "SSLv3/TLS Network Protocol Analyzer"
DESCRIPTION = "ssldump is an SSLv3/TLS network protocol analyzer. It identifies TCP \
connections on the chosen network interface and attempts to interpret \
them as SSLv3/TLS traffic. When it identifies SSLv3/TLS traffic, it \
decodes the records and outputs them in a textual form to stdout. If \
provided with the appropriate keying material, it also decrypts the \
connections and displays the application data traffic."
LICENSE = "BSD-3-Clause"

PV = "1.9"

RPM_NAME = "ssldump-1.9-3.5.aarch64.rpm"
RPM_HASH = "d63fbd9c9ee1424e556d01a578a4c0c24994805a905d4ad4b03effa8709324d28f5a3a69998fb9ca2af4bbba34a570c90ab1e6627c8d4e640d5772e508339e4e"

RPROVIDES:${PN} += "ssldump"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libjson-c.so.5 \
libnet.so.9 \
libpcap.so.1 \
libssl.so.3"

inherit rpm
