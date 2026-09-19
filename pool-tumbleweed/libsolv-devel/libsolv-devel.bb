SUMMARY = "Development files for libsolv, a package solver"
DESCRIPTION = "Development files for libsolv, a library for solving packages and \
reading repositories."
LICENSE = "BSD-3-Clause"

PV = "0.7.39"

RPM_NAME = "libsolv-devel-0.7.39-1.4.aarch64.rpm"
RPM_HASH = "8bcb0779ba371e8600376d013f6132672982679417aea757b2068eb97e369a6016729fed06d75ad5dfdc444ad170ccad4e15566c80e5df2f25d6b05ea68fafd4"

RPROVIDES:${PN} += "libsolv-devel \
pkgconfig-libsolv \
pkgconfig-libsolvext"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsolv1 \
libxml2.so.16 \
pkgconfig-libsolv \
rpm-devel"

inherit rpm
