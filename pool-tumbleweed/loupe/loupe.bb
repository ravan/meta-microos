SUMMARY = "A simple image viewer application"
DESCRIPTION = "A simple image viewer application written with GTK4 and Rust."
LICENSE = "GPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "loupe-50.0-1.4.aarch64.rpm"
RPM_HASH = "131227fcf5da64b339b6d4a9d4bd161596f58c8c7d5f1c953076b3747d304212c3fa292c6839809c74bcd3c52b4f4ca16e44d1f2b076d78f66b82397a71e84b0"

RPROVIDES:${PN} += "loupe"

RDEPENDS:${PN} += "glycin-loaders \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libgweather-4.so.0 \
liblcms2.so.2 \
libm.so.6 \
libseccomp.so.2"

inherit rpm
