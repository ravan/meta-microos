SUMMARY = "MATE Desktop calculator application"
DESCRIPTION = "mate-calc is a calculator application that was part of the \
OpenWindows Deskset of the Solaris 8 operating system. \
It incorporates multiple precision arithmetic packages based on the \
work of Professor Richard Brent."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-calc-1.28.0-2.6.aarch64.rpm"
RPM_HASH = "b8818a7963e71ca5ffa203bcb53ff69710b33a071b78d12ac15dac21eb3daf6dd0492746961b98576b4157e92e74f49cdb88eddb99832ddc75c28cb472c19ed2"

RPROVIDES:${PN} += "mate-calc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmpc.so.3 \
libmpfr.so.6 \
libpango-1.0.so.0 \
libxml2.so.16"

inherit rpm
