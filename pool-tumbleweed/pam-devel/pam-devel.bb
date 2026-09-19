SUMMARY = "Include Files and Libraries for PAM Development"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool which \
allows system administrators to set authentication policy without \
having to recompile programs which do authentication. \
 \
This package contains header files and static libraries used for \
building both PAM-aware applications and modules for use with PAM."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.7.2+git48"

RPM_NAME = "pam-devel-1.7.2+git48-1.1.aarch64.rpm"
RPM_HASH = "ae6d720b69e9893adad29d23877c6b8d870792676093063ffc8af5e884b8f26ea13aca758315c9b7c1a25faa8c1b2d9a9f6af34c8226480463022abc16f51605"

RPROVIDES:${PN} += "pam-devel \
pkgconfig-pam \
pkgconfig-pam-misc \
pkgconfig-pamc \
rpm-macro--pam-confdir \
rpm-macro--pam-libdir \
rpm-macro--pam-moduledir \
rpm-macro--pam-secconfdir \
rpm-macro--pam-secdistconfdir \
rpm-macro--pam-vendordir \
rpm-macro--pamdir"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
pam"

inherit rpm
