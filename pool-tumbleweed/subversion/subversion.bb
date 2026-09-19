SUMMARY = "Subversion version control system"
DESCRIPTION = "Subversion exists to be universally recognized and adopted as an open-source, \
centralized version control system characterized by its reliability as a safe \
haven for valuable data; the simplicity of its model and usage; and its ability \
to support the needs of a wide variety of users and projects, from individuals \
to large-scale enterprise operations."
LICENSE = "Apache-2.0"

PV = "1.14.5"

RPM_NAME = "subversion-1.14.5-5.3.aarch64.rpm"
RPM_HASH = "bcee1fe6fe0f540acbe51fdbc4db2d3f11f7a0499afacfb5a4426ba60634cf6d88785164009e4527666cc9e8d222a08d5d6c28809a30fc91900dcc3d713bdda0"

RPROVIDES:${PN} += "group-svn \
libsvn-client-1.so.0 \
libsvn-delta-1.so.0 \
libsvn-diff-1.so.0 \
libsvn-fs-1.so.0 \
libsvn-fs-base-1.so.0 \
libsvn-fs-fs-1.so.0 \
libsvn-fs-util-1.so.0 \
libsvn-fs-x-1.so.0 \
libsvn-ra-1.so.0 \
libsvn-ra-local-1.so.0 \
libsvn-ra-serf-1.so.0 \
libsvn-ra-svn-1.so.0 \
libsvn-repos-1.so.0 \
libsvn-subr-1.so.0 \
libsvn-wc-1.so.0 \
libsvnjavahl-1.so.0 \
subversion \
subversion-javahl \
user-svn"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libdb-4.8.so \
libexpat.so.1 \
libgcc-s.so.1 \
liblz4.so.1 \
libmagic.so.1 \
libsasl2.so.3 \
libserf-1.so.1 \
libsqlite3-0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libutf8proc.so.3 \
libz.so.1 \
systemd \
sysuser-shadow"

inherit rpm
