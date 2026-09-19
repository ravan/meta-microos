SUMMARY = "A library for wxWidgets support in Erlang"
DESCRIPTION = "A Graphics System used to write platform independent user interfaces."
LICENSE = "Apache-2.0"

PV = "28.5.0.4"

RPM_NAME = "erlang-wx-28.5.0.4-1.1.aarch64.rpm"
RPM_HASH = "b3110d9a2c750e7fd3930a04fb51d1848f833f59448d0783c19a4590a734b79d24ec780587d466fc1e2a8a886c68ea2d33278968491c228b37eee6a09d254c68"

RPROVIDES:${PN} += "erlang-wx"

RDEPENDS:${PN} += "erlang \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-aui-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0 \
libwx-gtk2u-gl-suse.so.16.0.0 \
libwx-gtk2u-html-suse.so.16.0.0 \
libwx-gtk2u-stc-suse.so.16.0.0 \
libwx-gtk2u-xrc-suse.so.16.0.0 \
wxWidgets"

inherit rpm
