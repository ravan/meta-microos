SUMMARY = "Office Software"
DESCRIPTION = "Office software for your desktop environment including LibreOffice."
LICENSE = "MIT"

PV = "20170506"

RPM_NAME = "patterns-office-office-20170506-3.20.aarch64.rpm"
RPM_HASH = "7324bddc043e5a9b3caee861a3a8b2ba16b50ee96c5ff445d0eb38090175764fc28cfc9262b5fc48634e597387f5577ea50d9f0b04276b2fbdd9728b164def14"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-office-office"

RDEPENDS:${PN} += ""

inherit rpm
