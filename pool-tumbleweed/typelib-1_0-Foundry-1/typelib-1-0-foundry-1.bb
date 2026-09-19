SUMMARY = "IDE library and command-line companion tool"
DESCRIPTION = "This tool aims to extract much of what makes GNOME Builder an IDE into a \
library and companion command-line tool."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-or-later & Apache-2.0"

PV = "1.1.1"

RPM_NAME = "typelib-1_0-Foundry-1-1.1.1-1.3.aarch64.rpm"
RPM_HASH = "6b47bfeba1b007167f1e527a0fa0c340ed701ce696bd76db90497e1ba84f24362ba9a9663b0ccd6dcf4df925507bfd9fa8f90c2cbe343cd96a2fc3ce63ca839b"

RPROVIDES:${PN} += "typelib-1-0-Foundry-1 \
typelib-Foundry"

RDEPENDS:${PN} += "libfoundry-1.so.1 \
typelib-Dex \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Json \
typelib-Peas"

inherit rpm
