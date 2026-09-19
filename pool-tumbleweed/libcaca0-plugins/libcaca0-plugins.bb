SUMMARY = "Plugins for libcaca"
DESCRIPTION = "This package contains gl and x11 plugins for caca."
LICENSE = "WTFPL"

PV = "0.99.beta20+git.1776622070.7c8e333"

RPM_NAME = "libcaca0-plugins-0.99.beta20+git.1776622070.7c8e333-2.3.aarch64.rpm"
RPM_HASH = "56d72f7b615469529aa1edb76c3878b60934fc77b266cd8f88f688c926122d7ad34f0765882373be24655441b624f1bc3bba6d28232e6506d65f3f445d1bd16e"

RPROVIDES:${PN} += "libcaca0-plugins \
libgl-plugin.so.0 \
libx11-plugin.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libX11.so.6 \
libc.so.6 \
libcaca \
libcaca.so.0 \
libglut.so.3"

inherit rpm
