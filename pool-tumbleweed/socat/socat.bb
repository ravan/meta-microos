SUMMARY = "Multipurpose relay for bidirectional data transfer"
DESCRIPTION = "socat is a relay for bidirectional data transfer between two \
independent data channels. Each of these data channels may be a file, \
pipe, device (serial line etc. or a pseudo terminal), a socket (UNIX, \
IP4, IP6 - raw, UDP, TCP), an SSL socket, proxy CONNECT connection, a \
file descriptor (stdin etc.), the GNU line editor, a program, or a \
combination of two of these."
LICENSE = "LicenseRef-SUSE-GPL-2.0-with-openssl-exception & MIT"

PV = "1.8.1.3"

RPM_NAME = "socat-1.8.1.3-2.1.aarch64.rpm"
RPM_HASH = "1cf8b18f06edfe577bdd1cb7f485544d6487e28b7ba7c2e2e78a87f1abe83b1205b07db8dbf3c4ef172b2c10d83c033445d799e2cfca6bcfcaa626f794c48e2d"

RPROVIDES:${PN} += "socat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libreadline.so.8 \
libssl.so.3 \
libwrap.so.0"

inherit rpm
