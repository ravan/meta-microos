SUMMARY = "Utility to modify keymaps and pointer button mappings in X"
DESCRIPTION = "The xmodmap program is used to edit and display the keyboard modifier \
map and keymap table that are used by client applications to convert \
event keycodes into keysyms. It is usually run from the user's \
session startup script to configure the keyboard according to personal \
tastes."
LICENSE = "MIT"

PV = "1.0.12"

RPM_NAME = "xmodmap-1.0.12-1.2.aarch64.rpm"
RPM_HASH = "93063bfc3a189a85e5e253b7531231bc7fc39f5ea2999150e1d7f58652e6114eaaea139b7033ef51f50a365d730dde19bd4549c9c50fb62626ee4bc635f09148"

RPROVIDES:${PN} += "xmodmap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
