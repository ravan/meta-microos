SUMMARY = "A tool to test PAM applications and PAM modules"
DESCRIPTION = "This component of cwrap allows you to either test your PAM (Linux-PAM \
and OpenPAM) application or module. \
 \
For testing PAM applications, a simple PAM module called pam_matrix is \
included. If you plan to test a PAM module, you can use the pamtest library, \
which simplifies testing of modules. You can combine it with the cmocka \
unit testing framework, or you can use the provided Python bindings to \
write tests for your module in Python. \
 \
This package does not have a devel package, because this project is for \
development/testing."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.8"

RPM_NAME = "pam_wrapper-1.1.8-1.4.aarch64.rpm"
RPM_HASH = "c673424b2b9fb63e65f1efdf832083bb3d3b728456538a8869f12b85a541142ea913c0ab5d6dcaca1d0da5ef56fdeae0ac5e40c2f29001acddf63bc67d3d62b2"

RPROVIDES:${PN} += "cmake-pam-wrapper \
libpam-wrapper.so.0 \
pam-wrapper \
pkgconfig-pam-wrapper"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0"

inherit rpm
