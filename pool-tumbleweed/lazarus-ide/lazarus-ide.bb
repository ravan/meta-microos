SUMMARY = "Lazarus RAD IDE for Free Pascal"
DESCRIPTION = "Lazarus is a cross-platform IDE and component library for Free Pascal. \
This package provides the Lazarus RAD IDE."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-only-with-Classpath-exception-2.0"

PV = "4.8"

RPM_NAME = "lazarus-ide-4.8-1.2.aarch64.rpm"
RPM_HASH = "a90b3ced97612975a2f000391be58ec82e856ab5c62b74cf97643130d0c06d33d4df51775a306f18c94d159bad8a06c70636a61b16c4ad98b34111715f46b119"

RPROVIDES:${PN} += "lazarus-ide"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
fpc-src \
gdb \
hicolor-icon-theme \
lazarus-lcl \
lazarus-tools \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgthread-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
make"

inherit rpm
