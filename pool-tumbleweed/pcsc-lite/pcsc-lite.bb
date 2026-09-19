SUMMARY = "PC/SC Smart Cards Library"
DESCRIPTION = "PC/SC Lite provides a Windows SCard interface in a small form factor \
for communication with smart cards and readers. \
 \
Security aware people should read the SECURITY file for possible \
vulnerabilities of pcsclite and how to fix them. For information on how \
to install drivers please read the DRIVERS file. \
 \
Memory cards will be supported through the MCT specification, which is \
an APDU like manner sent normally through the SCardTransmit() function. \
This functionality is exercised in the driver."
LICENSE = "BSD-3-Clause & GPL-3.0-or-later"

PV = "2.3.3"

RPM_NAME = "pcsc-lite-2.3.3-2.4.aarch64.rpm"
RPM_HASH = "64ea9450e6ceebde63312a4048dcce65a4253302c02feac33d5b0ea31bb70e92db16955bf7c9d1c042aba3440614002361312f2d9fb8fcf0083b108f253e974f"

RPROVIDES:${PN} += "config-pcsc-lite \
group-scard \
pcsc-lite \
pcscd \
user-scard"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpcsclite1 \
libpolkit-gobject-1.so.0 \
libsystemd.so.0 \
libudev.so.1 \
systemd \
sysuser-shadow"

inherit rpm
