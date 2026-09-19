SUMMARY = "Linux-PAM Module that Allows a User to Be Chrooted"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
pam_chroot is a Linux-PAM module that allows a user to be chrooted in \
auth, account, or session."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.2"

RPM_NAME = "pam_chroot-0.9.2-65.9.aarch64.rpm"
RPM_HASH = "2e5ef2ba126ea5fe22e5422276876ce4eb0404175ad1ebc88351ede68759cf834d80db64a73049661a37668c5d6b72a7f47e183b4abec04da57b0092a045e080"

RPROVIDES:${PN} += "config-pam-chroot \
pam-chroot \
pam-modules-/etc/security/chroot.conf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
pam"

inherit rpm
