SUMMARY = "A Pluggable Authentication Module for libcgroup"
DESCRIPTION = "Linux-PAM module, which allows administrators to classify the user's login \
processes to pre-configured control group."
LICENSE = "LGPL-2.1-only"

PV = "3.1.0"

RPM_NAME = "libcgroup-pam-3.1.0-1.9.aarch64.rpm"
RPM_HASH = "97a158c09b34d5250916eb7b7a13de14982a5d0be40067d63aa33480e84ffde250520bcfbc8f90580681eaa3e597fd99d847b0c860a76275a4d2d13f4ed745d8"

RPROVIDES:${PN} += "libcgroup-pam \
libcgroup-tools-/usr/lib64/security/pam-cgroup.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcgroup.so.3 \
libpam.so.0 \
pam"

inherit rpm
