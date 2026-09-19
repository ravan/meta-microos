SUMMARY = "Support library for subtitleeditor"
DESCRIPTION = "Support library for subtitleeditor, a GTK+3 tool to edit subtitles."
LICENSE = "GPL-3.0-or-later"

PV = "0.56.2"

RPM_NAME = "libsubtitleeditor0-0.56.2-1.4.aarch64.rpm"
RPM_HASH = "1f77cc3ac4450bc8baa01fd764d3d3ce883230973a4a9945af0570e700f3800cb7c111752f150ff68f86a3f49f03e3d57d663bf4a68ef1f4bedb3cc589c97a7a"

RPROVIDES:${PN} += "libsubtitleeditor.so.0 \
libsubtitleeditor0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libenchant-2.so.2 \
libgcc-s.so.1 \
libgdkmm-3.0.so.1 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgtkmm-3.0.so.1 \
libpangomm-1.4.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libxml++-3.0.so.1"

inherit rpm
