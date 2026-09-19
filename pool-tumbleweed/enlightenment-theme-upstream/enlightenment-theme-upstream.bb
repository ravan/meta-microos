SUMMARY = "Default Enlightenment theme"
DESCRIPTION = "For use with upstream branding, when using openSUSE themes, when using \
openSUSE themes Use the Flat theme instead."
LICENSE = "BSD-2-Clause & LGPL-2.1-only"

PV = "0.21.0"

RPM_NAME = "enlightenment-theme-upstream-0.21.0-37.1.aarch64.rpm"
RPM_HASH = "38252e6e236052dbf9a5047e312b5d19725dc2690f159487001be8fd168481a218bd46797bc04158caeaf214bc1ca87e815b99fbabd96781fd62cc9eab1ec48d"

RPROVIDES:${PN} += "enlightenment-theme \
enlightenment-theme-dft \
enlightenment-theme-upstream"

RDEPENDS:${PN} += ""

inherit rpm
