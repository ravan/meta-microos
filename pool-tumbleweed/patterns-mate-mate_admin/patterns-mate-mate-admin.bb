SUMMARY = "MATE Administration Tools"
DESCRIPTION = "Administration Tools e.g. for desktop lockdown."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-mate-mate_admin-20170319-6.3.aarch64.rpm"
RPM_HASH = "8585dbc54c3ff3e8c32b238f5ee8d771db5ce28133def18ba71c01a4eec9262715056f6545703162ec39013642daf98b3c44ac1c38a984c7a6a70a62f63c5dcc"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-mate-mate-admin"

RDEPENDS:${PN} += "pattern-"

inherit rpm
