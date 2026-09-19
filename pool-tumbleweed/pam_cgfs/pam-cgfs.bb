SUMMARY = "PAM module to provide unprivileged cgroupfs"
DESCRIPTION = "When a user logs in, this PAM module will create cgroups which the user may \
administer, either for all controllers or for any controllers listed on the \
command line."
LICENSE = "LGPL-2.1-only"

PV = "7.0.0"

RPM_NAME = "pam_cgfs-7.0.0-1.3.aarch64.rpm"
RPM_HASH = "9fd80979c5ed7ebee95ead715ec15b6675db53d5a099460347d348277c55a957ff950cb02d0107a1ca45273adbbeef1c8e9856689c8901cc4fb8b0b72194f2ca"

RPROVIDES:${PN} += "pam-cgfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libpam.so.0 \
libseccomp.so.2 \
libselinux.so.1"

inherit rpm
