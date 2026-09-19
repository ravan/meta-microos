SUMMARY = "Support for creating LibreOffice dialogs in glade"
DESCRIPTION = "libreoffice-glade contains a catalog of LibreOffice-specific widgets for \
glade and ui-previewer tool to check the visual appearance of dialogs."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-glade-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "6c6d6b130edd9da37f8bbe4f98d1320a57fbaa92dc8df510c63b8ff615d2e1a806ffe95970fcc14755fbf5eb23e34b078154fe8cf44de392c1b60d9531857009"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-glade"

RDEPENDS:${PN} += "libreoffice"

inherit rpm
