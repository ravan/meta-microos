SUMMARY = "A library to disable resource limits and other privilege dropping"
DESCRIPTION = "priv_wrapper aims to help running processes which are dropping privileges or are \
restricting resources in test environments. \
It can disable chroot, prctl, pledge and setrlmit system calls. A disabled call always \
succeeds (i.e. returns 0) and does nothing. \
The system call pledge exists only on OpenBSD. \
 \
To use it, set the following environment variables: \
 \
LD_PRELOAD=libpriv_wrapper.so \
PRIV_WRAPPER_CHROOT_DISABLE=1 \
 \
This package does not have a devel package, because this project is for \
development/testing."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.1"

RPM_NAME = "priv_wrapper-1.0.1-3.12.aarch64.rpm"
RPM_HASH = "8392a5d706c6ba1ee15b9d6cb0f57fc417075157d99fe2d47a21a5ffccc4b1333fdca3959a656079daf722a29a25b9977959ae6e5e329c5e3b54474e5ce2e42e"

RPROVIDES:${PN} += "cmake-priv-wrapper \
libpriv-wrapper.so.0 \
pkgconfig-priv-wrapper \
priv-wrapper"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
