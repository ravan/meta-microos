SUMMARY = "New GNOME secrets manager"
DESCRIPTION = "Key Rack allows to view and edit keys, like passwords or tokens, stored by apps. \
It supports Flatpak secrets as well as system wide secrets."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "key-rack-0.5.0-1.3.aarch64.rpm"
RPM_HASH = "241cf67b96f7b3abfb646a2cb473985d2f34d27a5538111b98336d07122a1c4b0f375fcf05e5ce09b14b89a920a17ba9f6780c2767307b2269eec760f80875bf"

RPROVIDES:${PN} += "key-rack"

RDEPENDS:${PN} += "libadwaita-1.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libm.so.6"

inherit rpm
