SUMMARY = "Oracle Cluster File System 2 Core Tools"
DESCRIPTION = "OCFS2 is the Oracle Cluster File System. \
 \
This package contains the core user-space tools needed for creating and \
managing the file system."
LICENSE = "GPL-2.0-only"

PV = "1.8.8"

RPM_NAME = "ocfs2-tools-1.8.8-8.6.aarch64.rpm"
RPM_HASH = "bd7935d51963b358e9ac0ce88903b5a76e089a3ad3cbeb890bee0e2fdb623fb6637ac92de42f29c9d291fdf03726b4fd684822821f727d23aa21ef385ba86cff"

RPROVIDES:${PN} += "ocfs2-tools"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/touch \
e2fsprogs \
fillup \
glib2 \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libcmap.so.4 \
libcom-err.so.2 \
libdlm \
libdlm-lt.so.3 \
libglib-2.0.so.0 \
libreadline.so.8 \
libuuid.so.1 \
modutils \
net-tools"

inherit rpm
