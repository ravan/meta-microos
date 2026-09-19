SUMMARY = "GClient library for fcitx5"
DESCRIPTION = "This package provides GClient library for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.5"

RPM_NAME = "libFcitx5GClient2-5.1.5-1.4.aarch64.rpm"
RPM_HASH = "109943c27e699a2b44d7d87b7162e28dc226d1a6fb04714c07cb50c7809241a598f3e982235cd5114e5eeb944ed39e6818678dae143b3710f38abec882d409d6"

RPROVIDES:${PN} += "libFcitx5GClient.so.2 \
libFcitx5GClient2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
