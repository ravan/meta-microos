SUMMARY = "Development files for libFcitx5GClient"
DESCRIPTION = "This package provides development files for libFcitx5GClient."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.5"

RPM_NAME = "libFcitx5GClient-devel-5.1.5-1.4.aarch64.rpm"
RPM_HASH = "6ce6359718d7dfbf39a814b22857b85e09548f184db6b9cfec864422832f1e435e89c59d11fde94f44dbaedbd3dafe137c5015de8416831dbb538d9580d4c95d"

RPROVIDES:${PN} += "cmake-Fcitx5GClient \
libFcitx5GClient-devel \
pkgconfig-Fcitx5GClient"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libFcitx5GClient2 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
