SUMMARY = "Enhanced FTP Client"
DESCRIPTION = "tnftp is the FTP (File Transfer Protocol) client from NetBSD.  FTP is a widely \
used protocol for transferring files over the Internet and for archiving files. \
tnftp provides some advanced features beyond the Linux netkit ftp client, but \
maintains a similar user interface to the traditional ftp client.  It was \
formerly called lukemftp."
LICENSE = "BSD-3-Clause"

PV = "20260211"

RPM_NAME = "tnftp-20260211-2.3.aarch64.rpm"
RPM_HASH = "4ab61796cc3efa0b945b61373f7a77b16802db2a511e2834d634992a2d801523a113b3239e55b2af612280397750a73ba01c05331b8f108b9206ed322619f34d"

RPROVIDES:${PN} += "lukemftp \
nkitb-/usr/bin/ftp \
tnftp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libedit.so.0 \
libssl.so.3 \
update-alternatives"

inherit rpm
