SUMMARY = "QTermWidget data package"
DESCRIPTION = "Data files for qtermwidget library."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "qtermwidget-qt5-data-1.4.0-2.7.noarch.rpm"
RPM_HASH = "421f9ceb910ce8fc1a433882cd1df609863630d51161577b84a00befc213e7325c31069c89a14e573aed979964ffb50d326135c5b2b2c70b01c5f28ed1dddabd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qtermwidget-qt5-data"

RDEPENDS:${PN} += "libqtermwidget5-1"

inherit rpm
