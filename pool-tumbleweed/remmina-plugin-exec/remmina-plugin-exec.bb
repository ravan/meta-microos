SUMMARY = "Plugin for Remmina to allow execution of local commands"
DESCRIPTION = "This package provides a plugin for Remmina allowing the execution of \
local commands."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.43"

RPM_NAME = "remmina-plugin-exec-1.4.43-2.2.aarch64.rpm"
RPM_HASH = "1ee214bf186b64cbbdaf6361b7fc509dd75c8f22e193f55ad582c3bbfb9df52767b72ff3a34fbe9ea0ce96bb8719c32bf2e457b09e8c68d6014fb7233ed69367"

RPROVIDES:${PN} += "remmina-plugin-exec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
remmina"

inherit rpm
