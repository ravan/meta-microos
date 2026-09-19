SUMMARY = "leechcraft_utilities"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-leechcraft-leechcraft_utilities-20170319-1.24.aarch64.rpm"
RPM_HASH = "558536adb2c2cb6bcb89e4c9fd3303c06ace3f31f6a53383da7b78bab0cf03da2bf0e991dfaa26a61d3dcc511ca4a752fd13a59c8fcee43254aef2f853e4ed36"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-leechcraft-leechcraft-utilities"

RDEPENDS:${PN} += "leechcraft \
pattern-"

inherit rpm
