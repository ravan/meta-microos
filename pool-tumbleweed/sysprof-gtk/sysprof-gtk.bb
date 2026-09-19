SUMMARY = "Sysprof binary with GUI support"
DESCRIPTION = "Sysprof is a sampling CPU profiler for Linux that collects accurate, \
high-precision data and provides efficient access to the sampled \
calltrees. \
 \
This package provides the sysprof binary with GUI support."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "sysprof-gtk-50.0-1.3.aarch64.rpm"
RPM_HASH = "7c898892bd31c7bd1ad5cc51a9c60379054a4b46ecf495f36631f6aef03f3e33c2175a1b0f23d5d7eac374099f9c8c9ed3b0de15f97177660a50815a7c8dda94"

RPROVIDES:${PN} += "sysprof-gtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libdebuginfod.so.1 \
libdex-1.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libpanel-1.so.1 \
libpango-1.0.so.0 \
libpolkit-gobject-1.so.0 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm
