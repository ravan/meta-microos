SUMMARY = "A desktop-wide extension service"
DESCRIPTION = "An extension service that allows apps to use the exposed functionality of \
registered apps. This way, applications do not have to have the functions \
hard coded into them."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.5"

RPM_NAME = "contractor-0.3.5-4.9.aarch64.rpm"
RPM_HASH = "a3a8e3a733de13ae6bacc4636294073091e68171ba7f753b9470f58f2a84c4933182a3687450c9b6e9479ec1a12e7b16054263c9db1d3744a797c38e9e0a1298"

RPROVIDES:${PN} += "contractor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
