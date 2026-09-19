SUMMARY = "Debian repository metadata generator"
DESCRIPTION = "reprepro is a tool to manage a repository of Debian packages (.deb).  It \
stores files either being injected manually or downloaded from some other \
repository (partially) mirrored into one pool/ hierarchy.  Managed packages \
and files are stored in a Berkeley DB, so no database server is needed. \
Checking signatures of mirrored repositories and creating signatures of the \
generated Package indexes is supported."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & MIT"

PV = "5.5.1"

RPM_NAME = "reprepro-5.5.1-1.1.aarch64.rpm"
RPM_HASH = "b9a994d522db25a321481af9effa39ae9127546a374ca920ff79fc0dcaac1544f0787c16afdc3f8180a00888220de628ece0c3201a8d91742c7822822180e6f6"

RPROVIDES:${PN} += "reprepro"

RDEPENDS:${PN} += "bzip2 \
gpg2 \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libdb-4.8.so \
libgpg-error.so.0 \
libgpgme.so.45 \
tar \
zstd"

inherit rpm
