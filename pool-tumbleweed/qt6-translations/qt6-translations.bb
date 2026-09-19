SUMMARY = "Qt 6 Translations"
DESCRIPTION = "Translations for Qt6 libraries and tools."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-translations-6.11.2-1.1.noarch.rpm"
RPM_HASH = "ab4c5f6ea76b2cb38992b80238e02db6a3dd39a1c175940712b6f14eff8629ee195068de496196e4f5ae1aefdae7f0393d20d901ed2cdb4175f15115b47548cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-translations"

RDEPENDS:${PN} += ""

inherit rpm
