SUMMARY = "Tool for adjusting the color temperature of the screen"
DESCRIPTION = "Redshift adjusts the color temperature of the screen according to time. \
This may help easing eyestrain when working at night. \
Time-independent manual operation and individual gamma curve \
setting is possible as well."
LICENSE = "GPL-3.0-only"

PV = "1.12"

RPM_NAME = "redshift-1.12-9.7.aarch64.rpm"
RPM_HASH = "29dcdba3d487cc7925902df02c5b69b92feff4aa6f0d5687e86b3fbdc9bea211b0c76e5d7334344f54dc65a2bc8ffeee3404e8c21e005bb61614f34df74e296a"

RPROVIDES:${PN} += "config-redshift \
redshift"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXxf86vm.so.1 \
libc.so.6 \
libdrm.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libxcb-randr.so.0 \
libxcb.so.1 \
systemd"

inherit rpm
