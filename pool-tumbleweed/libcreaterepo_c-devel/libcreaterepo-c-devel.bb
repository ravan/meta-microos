SUMMARY = "Library for repodata manipulation"
DESCRIPTION = "This package contains the createrepo_c C library and header files. \
These development files are for easy manipulation with a repodata."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.3"

RPM_NAME = "libcreaterepo_c-devel-1.2.3-1.4.aarch64.rpm"
RPM_HASH = "fbe1d72b5e7d5d9b6d01d010e6a558b59e43852a979b83f623527858b9ae20b897c27ae8f51488e3addaec29b46cdb94c5ee6339360dc154c6cf9cb93c241996"

RPROVIDES:${PN} += "createrepo-c-devel \
libcreaterepo-c-devel \
pkgconfig-createrepo-c"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcreaterepo-c1 \
pkgconfig \
pkgconfig-glib-2.0 \
pkgconfig-libcurl \
pkgconfig-libxml-2.0 \
pkgconfig-rpm \
pkgconfig-sqlite3 \
pkgconfig-zlib"

inherit rpm
