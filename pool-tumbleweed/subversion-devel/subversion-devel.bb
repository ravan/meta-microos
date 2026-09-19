SUMMARY = "Development package for Subversion developers"
DESCRIPTION = "The subversion-devel package includes the static libraries and include \
files for developers interacting with the subversion package."
LICENSE = "Apache-2.0"

PV = "1.14.5"

RPM_NAME = "subversion-devel-1.14.5-5.3.aarch64.rpm"
RPM_HASH = "91662ae4853b6c093b0e7a6cd54322a7a5e7284f9742cdc8ec40d49a54dcd127ebf61e1f1b4cfcb293ecf7b89a6da8d44437d881f06f0a5cb8905e8b49dd6d6b"

RPROVIDES:${PN} += "pkgconfig-libsvn-auth-gnome-keyring \
pkgconfig-libsvn-auth-kwallet \
pkgconfig-libsvn-client \
pkgconfig-libsvn-delta \
pkgconfig-libsvn-diff \
pkgconfig-libsvn-fs \
pkgconfig-libsvn-fs-base \
pkgconfig-libsvn-fs-fs \
pkgconfig-libsvn-fs-util \
pkgconfig-libsvn-fs-x \
pkgconfig-libsvn-ra \
pkgconfig-libsvn-ra-local \
pkgconfig-libsvn-ra-serf \
pkgconfig-libsvn-ra-svn \
pkgconfig-libsvn-repos \
pkgconfig-libsvn-subr \
pkgconfig-libsvn-wc \
subversion-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libapr-util1-devel \
pkgconfig-apr-1 \
pkgconfig-apr-util-1 \
pkgconfig-libsecret-1 \
pkgconfig-libsvn-delta \
pkgconfig-libsvn-diff \
pkgconfig-libsvn-fs \
pkgconfig-libsvn-fs-util \
pkgconfig-libsvn-ra \
pkgconfig-libsvn-repos \
pkgconfig-libsvn-subr \
pkgconfig-libsvn-wc \
pkgconfig-serf-1 \
pkgconfig-sqlite3 \
subversion"

inherit rpm
