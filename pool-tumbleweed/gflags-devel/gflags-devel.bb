SUMMARY = "Development files for the dynamic gflags library"
DESCRIPTION = "This package contains all necessary include files and the dynamic libraries \
needed for developing applications."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "gflags-devel-2.2.2-4.9.aarch64.rpm"
RPM_HASH = "21aaf3254e5b675e4ad1f6e91180f54191567075b45508c6fc88ccc04030b504174e283d4d48b77846a2996a1c4d4ed012d12d019501706123523c5203a8070c"

RPROVIDES:${PN} += "cmake-gflags \
gflags-devel \
pkgconfig-gflags"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgflags2-2"

inherit rpm
