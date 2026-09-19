SUMMARY = "CNS11643 input method for IBus framework"
DESCRIPTION = "ibus-table-cns11643 provides CNS11643 input method on IBus Table under IBus \
framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.21"

RPM_NAME = "ibus-table-cns11643-1.3.21-1.5.noarch.rpm"
RPM_HASH = "57c0d5f419257eb68bbac112f408b2a20c9667f39b37e721162ba32245091acb6979d35a454be390d401bf6641bf15f33c63138f3d3bdb166fd2c1df7a893596"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-cns11643"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
