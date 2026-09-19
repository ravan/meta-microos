SUMMARY = "SELinux command-line utilities"
DESCRIPTION = "Security-enhanced Linux is a feature of the kernel and some \
utilities that implement mandatory access control policies, such as \
Type Enforcement, Role-based Access Control and Multi-Level \
Security. \
 \
This subpackage contains utilities to inspect and administer the \
system's SELinux state."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "3.11"

RPM_NAME = "selinux-tools-3.11-2.1.aarch64.rpm"
RPM_HASH = "426f349fa4fb9e056595cd9435bc3c68bb16a35e38dbfff94164d244252eb1fe7745186c1348b2449da1d7787e42c016d0a68880b5f2ee5bdde8e33420b4ee3e"

RPROVIDES:${PN} += "libselinux-utils \
selinux-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0 \
libselinux.so.1 \
libselinux1 \
libsepol.so.2"

inherit rpm
