SUMMARY = "MIME email parser for KDE PIM - development files"
DESCRIPTION = "This package contains development headers needed to use MIME message parsing \
in KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "akonadi-mime-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "f592f35cadc4ef07fd61554be9088e8332350bc393abbc85d13548426d93ff8967edd36b29ab69167e46ef774cf6427064fe5754e686344adaa4fdbbc0eb3318"

RPROVIDES:${PN} += "akonadi-mime-devel \
cmake-KPim6AkonadiMime"

RDEPENDS:${PN} += "cmake-KPim6Akonadi \
libKPim6AkonadiMime6"

inherit rpm
