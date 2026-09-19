SUMMARY = "Yaru sound theme"
DESCRIPTION = "This is the theme shaped by the community on the Ubuntu hub. \
 \
This package contains the sound theme following the XDG theming \
specification."
LICENSE = "CC-BY-SA-4.0"

PV = "24.04.0"

RPM_NAME = "sound-theme-yaru-24.04.0-1.9.noarch.rpm"
RPM_HASH = "6130c003f11e17a44c6ef80cff33c31b2432461cd5ea36d0d67f45662526482a5bcf9ecbf26217f90c8ce579a6ccc0d7cd25827682217460933e5814052a6564"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sound-theme-yaru"

RDEPENDS:${PN} += ""

inherit rpm
