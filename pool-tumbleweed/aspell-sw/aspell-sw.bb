SUMMARY = "Swahili (Kiswahili) Dictionary for Aspell"
DESCRIPTION = "A Swahili (Kiswahili) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0"

RPM_NAME = "aspell-sw-1.0-4.7.aarch64.rpm"
RPM_HASH = "f5a578b080e4f3d7f08bbc7b3df3da7e86ac7f69670ae8caff26da0af4bc65cd68695857554829b8b05989bacbb2541a8e78a50180619f3bcb07ec78fadb1c9d"

RPROVIDES:${PN} += "aspell-sw \
locale-aspell-sw"

RDEPENDS:${PN} += ""

inherit rpm
