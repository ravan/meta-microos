SUMMARY = "Configuration tool for Tux Paint"
DESCRIPTION = "Tux Paint has a rich set of configuration options, controllable via \
command-line options or configuration files. This configuration tool \
provides a point-and-click interface for administrators to tailor \
Tux Paint to suit the needs of their users."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.26"

RPM_NAME = "tuxpaint-config-0.0.26-1.3.aarch64.rpm"
RPM_HASH = "97e0fa156509b0d5375e56088ae19035bbec18bedc7525ce54b5de6e2406b8ab89125986f994ad28900f63c6989150e751bae55f546c7b921f6a7db2d50888ca"

RPROVIDES:${PN} += "tuxpaint-config"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfltk.so.1.3 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpaper.so.2 \
libstdc++.so.6 \
libunibreak.so.6 \
tuxpaint-config-lang"

inherit rpm
