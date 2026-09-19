SUMMARY = "MIME email parser for KDE PIM"
DESCRIPTION = "This package provides libraries needed for the correct parsing of email \
messages."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "akonadi-mime-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "1110c3fcdea8b0e17f4c4033ef33c3506fe61ff6061a4c49900b8993224efb2c7d607b9b5b06e358d539f6d9d42b659a62500b17e3ec18052e9750ae1d79e680"

RPROVIDES:${PN} += "akonadi-mime"

RDEPENDS:${PN} += ""

inherit rpm
