SUMMARY = "Rename extension for Caja"
DESCRIPTION = "An extension for the Caja file browser allowing users to rename \
multiple files/folders in a single pass. \
 \
The application can change the case, insert, replace and delete \
strings, as well as enumerate the selection. Any changes are \
instantly visible in the preview list. The user interface strives \
to be as simple as possible, without confusing advanced \
operations."
LICENSE = "GPL-3.0-or-later"

PV = "24.5.1"

RPM_NAME = "caja-extension-rename-24.5.1-1.11.aarch64.rpm"
RPM_HASH = "1ad3a226c344751b13c429419af54d6b55fcc1d68f732b64cb11266fba12f006e8d25dacd64c25cdde8690bf08277c0afe71827131e3c9e3ed5ecd71b4f0ebc4"

RPROVIDES:${PN} += "caja-extension-rename \
libcaja-rename.so"

RDEPENDS:${PN} += "caja \
caja-rename \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcaja-extension.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
