SUMMARY = "Some helpers for glib based environments on mobile devices"
DESCRIPTION = "gmobile carries some helpers for glib based environments on mobile devices. \
 \
Some of those parts might move to glib or libgnome-desktop eventually. It can be used as a shared library or git submodule. \
There aren't any API stability guarantees at this point in time."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.0"

RPM_NAME = "gmobile-devel-0.4.0-2.4.aarch64.rpm"
RPM_HASH = "5582d04d897de03e494b1fdb803cde835baa5088f4c02527aa7fa13cc2a226b7d66978b373244ad4a4820dfc3e1f201a42fed4ce37dc8283b230d120fb826401"

RPROVIDES:${PN} += "gmobile-devel \
pkgconfig-gmobile"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgmobile0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-json-glib-1.0 \
typelib-1-0-Gm-0"

inherit rpm
