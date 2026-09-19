SUMMARY = "MATE Office"
DESCRIPTION = "MATE Office"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-mate-mate_office-20170319-6.3.aarch64.rpm"
RPM_HASH = "7c3f40bb97a43885286dcb02185f24194caa0ae955e4a4df7ad8826ddbc83f85e29b7c0d16b8b63665d858cc6ce67b1c76580e88e3acdfc5bb4b27837f136812"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-mate-mate-office"

RDEPENDS:${PN} += "pattern-"

inherit rpm
