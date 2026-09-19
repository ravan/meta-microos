SUMMARY = "SELinux policy management library"
DESCRIPTION = "libsemanage is the policy management library. Using libsepol and \
libselinux to interact with the SELinux system, it also calls helper \
programs for loading policy and for checking whether the \
file_contexts configuration is valid. \
 \
(Security-enhanced Linux is a feature of the kernel and some \
utilities that implement mandatory access control policies, such as \
Type Enforcement, Role-based Access Control and Multi-Level \
Security.)"
LICENSE = "LGPL-2.1-or-later"

PV = "3.11"

RPM_NAME = "libsemanage2-3.11-1.2.aarch64.rpm"
RPM_HASH = "a0d2765c2088e3afbe34fe04ccf5b3f0d50728d747df963a4b77d931d81f4cb55e9cd6f0258648e2dcf9f9da8441e34e424fefb0801770698510bc1c08030abf"

RPROVIDES:${PN} += "libsemanage.so.2 \
libsemanage2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libbz2.so.1 \
libc.so.6 \
libselinux.so.1 \
libsemanage-conf \
libsepol.so.2"

inherit rpm
