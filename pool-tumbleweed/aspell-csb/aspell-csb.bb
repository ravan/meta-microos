SUMMARY = "Kashubian (kaszëbsczi) Dictionary for Aspell"
DESCRIPTION = "A Kashubian (kaszëbsczi) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.0"

RPM_NAME = "aspell-csb-0.02.0-4.7.aarch64.rpm"
RPM_HASH = "fa732b59c88389602748af05629c3eeb90964dde197e8565423744d84ada6c17d1408624fc65a17ad081850f2ee9b04d561ca579c172ae03bdce801dc2409878"

RPROVIDES:${PN} += "aspell-csb \
locale-aspell-csb"

RDEPENDS:${PN} += ""

inherit rpm
