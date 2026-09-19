SUMMARY = "SELinux policy core utilities"
DESCRIPTION = "policycoreutils contains the policy core utilities that are required \
for basic operation of a SELinux system.  These utilities include \
load_policy to load policies, setfiles to label filesystems, newrole \
to switch roles, and run_init to run /etc/init.d scripts in the proper \
context. \
 \
(Security-enhanced Linux is a feature of the kernel and some \
utilities that implement mandatory access control policies, such as \
Type Enforcement, Role-based Access Control and Multi-Level \
Security.)"
LICENSE = "GPL-2.0-or-later"

PV = "3.11"

RPM_NAME = "policycoreutils-3.11-2.2.aarch64.rpm"
RPM_HASH = "aaea5c483d1afe2a702d992d76af2fe314f977b89b3365a8a4efc154bb4d2d0ba4812c07f040d891b8a129382ce6f7fbd623968ae686d2ee4842b007316c17e8"

RPROVIDES:${PN} += "policycoreutils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
gawk \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libeconf.so.0 \
libpam-misc.so.0 \
libpam.so.0 \
libselinux.so.1 \
libsemanage.so.2 \
libsepol.so.2 \
libsepol2 \
rpm \
selinux-tools \
util-linux"

inherit rpm
