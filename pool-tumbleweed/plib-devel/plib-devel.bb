SUMMARY = "Development files for PLIB, a collection of game libraries"
DESCRIPTION = "Plib contains a selection of libraries that can be helpful for 3D game \
programming. It contains the following libraries: \
* JS - A Joystick interface. \
* PUI - A simple GUI built on top of OpenGL \
* SG - Some Standard Geometry functions \
* SL - A Games-oriented Sound Library \
* SSG - A Simple Scene Graph API built on top of OpenGL"
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.5+svn.2173"

RPM_NAME = "plib-devel-1.8.5+svn.2173-7.10.aarch64.rpm"
RPM_HASH = "e4d43330e03e036c6722ea247ef9f0373e8c1439647b93c29095b13489421aa153d5f4b0cdcc99f62c38dd9c5c087ddb00358e4ca05de709425f7fda4da1a2da"

RPROVIDES:${PN} += "plib-devel"

RDEPENDS:${PN} += "glibc-devel \
libplib0 \
pkgconfig-gl"

inherit rpm
