SUMMARY = "A PAM Module for User Authentication using a Radius Server"
DESCRIPTION = "This is the PAM to RADIUS authentication module. It allows any PAM-capable \
machine to become a RADIUS client for authentication and accounting \
requests. You will need a RADIUS server to perform the actual \
authentication."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "pam_radius-3.0.0-1.3.aarch64.rpm"
RPM_HASH = "c56d8f9cf204be2225130b50a4b23a513dd400de6b6f9184c58eb96f308ccbb199d6b69311bf4f896aa64a928b48e9665268d81045508844bcb4fa298a3b70c1"

RPROVIDES:${PN} += "config-pam-radius \
pam-radius"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
pam"

inherit rpm
