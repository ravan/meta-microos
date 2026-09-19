SUMMARY = "Library for repodata manipulation"
DESCRIPTION = "Libraries for applications using the createrepo_c library \
for easy manipulation with a repodata."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.3"

RPM_NAME = "libcreaterepo_c1-1.2.3-1.4.aarch64.rpm"
RPM_HASH = "82a872cd9a793df1becd0b18b0c542975d11bd4f7d19d39149506a0ab83cab6a802b58d4f1467c794cf3f093006ccd4fa26c636879e3c225a2fb4d5243646769"

RPROVIDES:${PN} += "libcreaterepo-c.so.1 \
libcreaterepo-c1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblzma.so.5 \
libmodulemd.so.2 \
librpm.so.10 \
librpmio.so.10 \
libsqlite3.so.0 \
libxml2.so.16 \
libz.so.1 \
libzck.so.1 \
libzstd.so.1"

inherit rpm
