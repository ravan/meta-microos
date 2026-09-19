SUMMARY = "Dracut modules usually not required for normal operation"
DESCRIPTION = "This package contains all modules that are part of dracut upstream \
but are not normally supported or required."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "112+suse.51.gf078a84"

RPM_NAME = "dracut-extra-112+suse.51.gf078a84-1.1.aarch64.rpm"
RPM_HASH = "b5350af0d9c74efd3ca4e7dff6434f9b4c345c52ac0c33b4ad22c2e39fe054eab69ce542eac54919aefc08e506de97cbc093bf5057efa4db35ef2dd57331d68a"

RPROVIDES:${PN} += "dracut-extra"

RDEPENDS:${PN} += "/usr/bin/bash \
dracut"

inherit rpm
