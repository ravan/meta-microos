SUMMARY = "Yawerty input method for IBus framework"
DESCRIPTION = "ibus-table-yawerty provides Yawerty input method on IBus Table under IBus \
framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.21"

RPM_NAME = "ibus-table-yawerty-1.3.21-1.5.noarch.rpm"
RPM_HASH = "d4b749d4ba27f5b01f12c9a2181dc2a4f1160cb3490802a1450d8399f84c3e83fee296425bd6b37085767aaf9fe243e3e55db7a67c414369bb6b2c26b7f2862e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-yawerty"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
