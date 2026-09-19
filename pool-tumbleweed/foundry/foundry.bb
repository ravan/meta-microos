SUMMARY = "IDE library and command-line companion tool"
DESCRIPTION = "This tool aims to extract much of what makes GNOME Builder an IDE into a \
library and companion command-line tool."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-or-later & Apache-2.0"

PV = "1.1.1"

RPM_NAME = "foundry-1.1.1-1.3.aarch64.rpm"
RPM_HASH = "a9a6b9e291955b4699c3f86976411f5ef264916058ffa4136e416259b020af635dbd8666e74da04d01da074dfdce4488d1ed58d924dbb4ad5007318a8ea5b52a"

RPROVIDES:${PN} += "foundry"

RDEPENDS:${PN} += "libc.so.6 \
libdex-1.so.1 \
libfoundry-1.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
