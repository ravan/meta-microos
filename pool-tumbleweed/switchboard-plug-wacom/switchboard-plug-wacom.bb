SUMMARY = "Manage drawing tablets and Wacom devices"
DESCRIPTION = "Manage drawing tablets and Wacom devices."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.2"

RPM_NAME = "switchboard-plug-wacom-8.0.2-1.3.aarch64.rpm"
RPM_HASH = "576fcc0850228e65108a5f6cb8e53f1bebcd1c5f08d355d26e4797ff6b38e4e8a3f32ac0dbc1599cfbacf268145dd865765cbbb1e7190c13fd11d4e93b841db9"

RPROVIDES:${PN} += "libwacom.so \
switchboard-plug-wacom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libgudev-1.0.so.0 \
libswitchboard-3.so.0 \
libwacom.so.9 \
switchboard"

inherit rpm
