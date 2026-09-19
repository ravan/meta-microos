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

RPM_NAME = "systemd-mini-experimental-261.2-1.1.aarch64.rpm"
RPM_HASH = "2805859d17bd98bac99bedad567eadeef7451d13a3a297105ba0ce6f7b67712a1aed4c60c694ecccf1afa006cefef1d6f7b4a8972a779dbd67932b6f5f2d6c24"

RPROVIDES:${PN} += "systemd-experimental \
systemd-mini-experimental"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd-shared-261.2-1.1.so \
systemd \
systemd-mini"

inherit rpm
