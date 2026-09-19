SUMMARY = "Translit-ua input method for IBus framework"
DESCRIPTION = "ibus-table-translit-ua provides Translit-ua input method on IBus Table under \
IBus framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.21"

RPM_NAME = "ibus-table-translit-ua-1.3.21-1.5.noarch.rpm"
RPM_HASH = "e62280aa645d53392932b756b45cef79228f4001c9945e8060be95710c438ed47067a7410fd326fd326fc98291353e3a62f8181529fecc493da60b5202fcd65a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-translit-ua \
locale-ibus-uk"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
