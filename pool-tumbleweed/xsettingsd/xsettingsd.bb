SUMMARY = "Provides settings to X11 applications"
DESCRIPTION = "xsettingsd is a daemon that implements the XSETTINGS specification. \
It is intended to be small, fast, and minimally dependent on other \
libraries. It can serve as an alternative to mate-settings-daemon for users \
who are not using the MATE desktop environment but who still run GTK+ \
applications and want to configure things such as themes, font \
antialiasing/hinting, and UI sound effects."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "xsettingsd-1.0.2-1.18.aarch64.rpm"
RPM_HASH = "25059c9ddc13d94efa075b6bc45fc2612f950f57d1896037cce1896ac901d2a42e1e6d3008464636c7e0a827acf53b98e5d7a995736fd002b22818f125343b0a"

RPROVIDES:${PN} += "xsettingsd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
