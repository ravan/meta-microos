SUMMARY = "Gnome Keyring Pasword Manager Plugin for Remmina"
DESCRIPTION = "This package provides a Remmina plugin for the GNOME keyring password manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.43"

RPM_NAME = "remmina-plugin-secret-1.4.43-2.2.aarch64.rpm"
RPM_HASH = "989dabfeb69871df9685f3092fa652787bb97c6eae4c803b2f02cc090f50c50261a882f9b233301060c081b78b6bb2a42d002112aee725b338c91a90381d0614"

RPROVIDES:${PN} += "remmina-plugin-secret \
remmina-plugins-gnome"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libsecret-1.so.0 \
remmina"

inherit rpm
