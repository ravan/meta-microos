SUMMARY = "Experimental systemd features"
DESCRIPTION = "This package contains optional extra services that are considered as previews \
and are provided so users can do early experiments with the new features or \
technologies without waiting for them to be fully supported by both upstream \
and openSUSE. \
 \
Please note that the material shipped by this package should be considered in \
development phase and as such their behaviors, unit files, option names, \
etc... are subject to change without the usual backwards-compatibility promises. \
 \
Components that turn out to be stable and considered as fully supported will be \
merged into the main package or moved into a dedicated package. \
 \
Currently this package contains the following features : bsod, oomd, measure, \
pcrextend, pcrlock, ssh-generator, storagetm, sysupdate. \
tpm2-setup and userwork. \
 \
Have fun (at your own risk)."
LICENSE = "LGPL-2.1-or-later"

PV = "261.2"

RPM_NAME = "systemd-experimental-261.2-1.2.aarch64.rpm"
RPM_HASH = "fe19bfebc7ea5043a773a4d80d199230df75ea92c3a039c3abe7921de7b204fbda2ca08263bfa3a66c0ab00bdc4846a9599152594d8938a786f481dd909c449a"

RPROVIDES:${PN} += "group-systemd-imds \
group-systemd-oom \
systemd-experimental \
user-systemd-imds \
user-systemd-oom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd-shared-261.2-1.2.so \
systemd"

inherit rpm
