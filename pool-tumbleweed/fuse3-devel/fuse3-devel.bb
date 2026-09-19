SUMMARY = "Development package for FUSE (userspace filesystem) modules"
DESCRIPTION = "This package contains all include files, libraries and configuration \
files needed to develop programs that use the fuse (FUSE) library to \
implement file systems in user space. \
 \
With fuse-devel, users can compile and install other user space file \
systems."
LICENSE = "BSD-2-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "3.18.3"

RPM_NAME = "fuse3-devel-3.18.3-1.1.aarch64.rpm"
RPM_HASH = "ae7ee4533407b0bf676e4a1cafbc592468c75ff0a8a53612f07b3fa3ea5212237b6d7245d3da9b0c2df50618476b65f8c9179d35909a0b01deccd6d47f042924"

RPROVIDES:${PN} += "fuse3-devel \
pkgconfig-fuse3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
fuse3 \
glibc-devel \
libfuse3-4"

inherit rpm
