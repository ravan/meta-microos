SUMMARY = "SELinux runtime library"
DESCRIPTION = "libselinux provides an interface to get and set process and file \
security contexts and to obtain security policy decisions. \
 \
(Security-enhanced Linux is a feature of the kernel and some \
utilities that implement mandatory access control policies, such as \
Type Enforcement, Role-based Access Control and Multi-Level \
Security.)"
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "3.11"

RPM_NAME = "libselinux1-3.11-2.1.aarch64.rpm"
RPM_HASH = "aa2483f21c456fb495156cce39fe788acf209fccb2c293b000b401445f1b0c810fcd5422dac10ee9d639caa8011894399c193d540128cf978c671747a359c313"

RPROVIDES:${PN} += "libselinux.so.1 \
libselinux1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0"

inherit rpm
