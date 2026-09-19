SUMMARY = "Star Traders, a simple game of interstellar trading"
DESCRIPTION = "Star Traders is a simple game of interstellar trading, where the objective \
is to create companies, buy and sell shares, borrow and repay money, in \
order to become the wealthiest player (the winner)."
LICENSE = "GPL-3.0-or-later"

PV = "7.21"

RPM_NAME = "trader-7.21-2.3.aarch64.rpm"
RPM_HASH = "215a81196daa5afebadd89438b8f7d25679d0804e7c0c4955f9ae5240a9d0407f5501034d468a18295d2ebb19222c07c229b8bcf2263f37be4b85fd62388bcd7"

RPROVIDES:${PN} += "trader"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
