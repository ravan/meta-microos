SUMMARY = "Cangjie input schema for rime"
DESCRIPTION = "cangjie input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-cangjie-20250315-1.4.noarch.rpm"
RPM_HASH = "1d4329968554dac23747d111d4c642bd2fc347e39cc0e3d8d25ab58e8737f6144c4b0e24c0be8e53eaa462c8805588fe1719156fcfd278cfeb7ee5f3f47b6616"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-cangjie"

RDEPENDS:${PN} += ""

inherit rpm
