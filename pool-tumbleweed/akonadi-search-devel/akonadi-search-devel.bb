SUMMARY = "Development package for baloo5"
DESCRIPTION = "Development files for the AkonadiSearch library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "akonadi-search-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "955f2023ab47442a50c52e63498a74b1370af3fc9658c131b2ace8e156e966cb901da2e808bf956bf182108d5e56c46e469090d72eda9737422695ae2cc99773"

RPROVIDES:${PN} += "akonadi-search-devel \
cmake-KPim6AkonadiSearch"

RDEPENDS:${PN} += "cmake-KF6CalendarCore \
cmake-KF6Contacts \
cmake-KF6CoreAddons \
cmake-KF6Mime \
cmake-KPim6Akonadi \
cmake-KPim6AkonadiMime \
cmake-Qt6Core \
libKPim6AkonadiSearch6"

inherit rpm
