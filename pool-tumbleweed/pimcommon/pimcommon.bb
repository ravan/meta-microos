SUMMARY = "Base package of KDE PIM PimCommon library"
DESCRIPTION = "This package contains the pimcommon library, used by several KDE PIM \
applications."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "pimcommon-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "1de0dbfb3de7e8b582392547e9635e46f6e18d64aa63c33f376380b11bd557edff2094818b2fea81eaabdf84e36ff2dc5f0ce170325e93a799a91305c76c87d7"

RPROVIDES:${PN} += "pimcommon"

RDEPENDS:${PN} += ""

inherit rpm
