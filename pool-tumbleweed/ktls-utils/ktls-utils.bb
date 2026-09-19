SUMMARY = "Agent for performing handshakes for kernel TLS sockets"
DESCRIPTION = "In-kernel TLS consumers need a mechanism to perform TLS handshakes on a \
connected socket to negotiate TLS session parameters that can then be \
programmed into the kernel's TLS record protocol engine. \
 \
This package of software provides a TLS handshake user agent that listens for \
kernel requests and then materializes a user space socket endpoint on which to \
perform these handshakes. The resulting negotiated session parameters are \
passed back to the kernel via standard kTLS socket options."
LICENSE = "GPL-2.0-only"

PV = "1.4.0+5.gddea5b0"

RPM_NAME = "ktls-utils-1.4.0+5.gddea5b0-1.3.aarch64.rpm"
RPM_HASH = "7964c000b8993aeeaf64bf42f46d42ada2832f657e01f160fab1f1ac092daef2542309918a1a43f4796235a9195cc2f5f1b700cb1f07299ffac3f3388586d87c"

RPROVIDES:${PN} += "config-ktls-utils \
ktls-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libkeyutils.so.1 \
libnl-3.so.200 \
libnl-genl-3.so.200"

inherit rpm
