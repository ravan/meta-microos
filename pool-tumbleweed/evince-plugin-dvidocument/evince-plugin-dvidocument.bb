SUMMARY = "DVI document support for Evince"
DESCRIPTION = "A plugin for Evince to read DVI documents."
LICENSE = "GPL-2.0-or-later"

PV = "48.4"

RPM_NAME = "evince-plugin-dvidocument-48.4-2.1.aarch64.rpm"
RPM_HASH = "e4342d4b1c2b07b1adbbcfa4e3657861ab445bff8ec327835862647bb6ffe3e94b368e0fdb1265b9d2031bfa474fee05b924a8ba2726eda6798b13f3e0c87e7f"

RPROVIDES:${PN} += "evince-plugin-dvidocument \
libdvidocument.so"

RDEPENDS:${PN} += "evince \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libevdocument3.so.4 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libkpathsea.so.6 \
libm.so.6 \
libspectre.so.1"

inherit rpm
