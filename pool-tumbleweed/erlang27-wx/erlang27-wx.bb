SUMMARY = "A library for wxWidgets support in Erlang"
DESCRIPTION = "A Graphics System used to write platform independent user interfaces."
LICENSE = "Apache-2.0"

PV = "27.1.3"

RPM_NAME = "erlang27-wx-27.1.3-3.1.aarch64.rpm"
RPM_HASH = "2b97f8056ae7dfa370393dbf5bc44249331db97cda1eb64bd49a745d5dad2a829b12ae2f69251ffe5c1325752e0c7ae79d077a6d13519cb02c965a5c63636bad"

RPROVIDES:${PN} += "erlang-wx \
erlang27-wx"

RDEPENDS:${PN} += "erlang27 \
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
