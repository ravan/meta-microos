SUMMARY = "Power profiles handling over D-Bus"
DESCRIPTION = "power-profiles-daemon offers to modify system behaviour based upon user-selected \
power profiles. There are 3 different power profiles: a 'balanced' default mode, \
a 'power-saver' mode, and a 'performance' mode."
LICENSE = "GPL-3.0-or-later"

PV = "0.30"

RPM_NAME = "power-profiles-daemon-0.30-1.7.aarch64.rpm"
RPM_HASH = "314df9ed1c872c914997a3c0f6e094dafecca8265a4aca993069738941e57b954a0d9f0dcf6145dce0ec4ae2ffa5d834d6d77f4a5925d6fcea70ecdd587ef06a"

RPROVIDES:${PN} += "power-profiles-daemon \
ppd-service"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libpolkit-gobject-1.so.0 \
polkit \
python3-gobject"

inherit rpm
