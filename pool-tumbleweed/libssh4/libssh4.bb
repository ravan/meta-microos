SUMMARY = "SSH library"
DESCRIPTION = "An SSH implementation in the form of a library. With libssh, you can remotely \
execute programs, transfer files, use a secure and transparent tunnel for your \
remote programs. It supports SFTP as well. \
 \
This package provides libssh from https://www.libssh.org that should not be \
confused with libssh2 available from https://www.libssh2.org (libssh2 package)"
LICENSE = "LGPL-2.1-or-later"

PV = "0.11.5"

RPM_NAME = "libssh4-0.11.5-2.1.aarch64.rpm"
RPM_HASH = "fd9362bd42d4fc55c8af9dbc157f517f77750456fa1f9d692a1fe6b65daf0cc459eb5d15dd632ef79b0daf26efa451d4e37778c679ba7579de6991993319f8e8"

RPROVIDES:${PN} += "libssh.so.4 \
libssh4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgssapi-krb5.so.2 \
libssh-config \
libz.so.1"

inherit rpm
