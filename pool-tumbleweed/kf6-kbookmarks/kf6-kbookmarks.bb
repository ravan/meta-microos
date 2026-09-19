SUMMARY = "Framework for manipulating bookmarks in XBEL format"
DESCRIPTION = "This is a framework for accessing and manipulating bookmarks using \
the XBEL format."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kbookmarks-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "92a4c6a0ba2f95d7769482aeed9fec271ee70d3e1c734bf0691405156284591d164c8f2ef5e118615eb2c5ba916b898ccf464df4f80a19c444d5ef9b283c13c2"

RPROVIDES:${PN} += "kf6-kbookmarks"

RDEPENDS:${PN} += ""

inherit rpm
