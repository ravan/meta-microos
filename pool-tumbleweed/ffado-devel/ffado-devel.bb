SUMMARY = "Development files for ffado"
DESCRIPTION = "This package supplys the files necessary to develop \
applications that use the FFADO libraries and API."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.9"

RPM_NAME = "ffado-devel-2.4.9-4.5.aarch64.rpm"
RPM_HASH = "097e43ff614ac005585626d340824f8a630941548fab2cd24587a05903f866a3a4e857ba8927c202325ae0a99f0967ef56d0921b6eabc8967964c6f00df934ef"

RPROVIDES:${PN} += "ffado-devel \
libffado-devel \
pkgconfig-libffado"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libffado2 \
pkgconfig-dbus-c++-1 \
pkgconfig-libconfig"

inherit rpm
