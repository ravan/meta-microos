SUMMARY = "Dynamic menu library and client program inspired by dmenu"
DESCRIPTION = "Dynamic menu library and client program inspired by dmenu with support \
for X, Wayland and ncurses."
LICENSE = "MIT"

PV = "0.6.23"

RPM_NAME = "bemenu-0.6.23-1.12.aarch64.rpm"
RPM_HASH = "e2905d4323b296aad5caed0c3b713da681befc025578518e08f0e87e8387ae070c6ab5b1e6e77784092ca00bafefe842e98fc9048d632c74980b060e1d2bd998"

RPROVIDES:${PN} += "bemenu"

RDEPENDS:${PN} += "libX11.so.6 \
libXinerama.so.1 \
libbemenu.so.0 \
libc.so.6 \
libcairo.so.2 \
libgobject-2.0.so.0 \
libncursesw.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libtinfo.so.6 \
libwayland-client.so.0 \
libxkbcommon.so.0"

inherit rpm
