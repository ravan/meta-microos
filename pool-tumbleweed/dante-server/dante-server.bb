SUMMARY = "A SOCKS v4/v5 server implementation"
DESCRIPTION = "This package contains the socks proxy daemon and its documentation. The \
sockd is the server part of the Dante socks proxy package and allows \
socks clients to connect through it to the network."
LICENSE = "BSD-3-Clause"

PV = "1.4.4"

RPM_NAME = "dante-server-1.4.4-2.4.aarch64.rpm"
RPM_HASH = "d47718321d7d560a009b8c04bdb5140a78e5cac3462ac7d1fa513a23529ab0104db55c58fa40aa6fe7616ceed5b50053827013458e7338d1f5d4cd39526b51dc"

RPROVIDES:${PN} += "config-dante-server \
dante-server \
dantesrv"

RDEPENDS:${PN} += "/usr/bin/sh \
dante \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libcrypt.so.1 \
libgssapi-krb5.so.2 \
libm.so.6 \
libminiupnpc.so.21 \
libpam.so.0 \
libwrap.so.0 \
systemd"

inherit rpm
