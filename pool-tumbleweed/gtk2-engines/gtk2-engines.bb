SUMMARY = "GTK+ 2 Theme Engines"
DESCRIPTION = "This package installs the theme engine libraries for GTK+ 2."
LICENSE = "LGPL-2.1-or-later"

PV = "2.20.2"

RPM_NAME = "gtk2-engines-2.20.2-23.6.aarch64.rpm"
RPM_HASH = "9884fbed8be9a48d0b351fa08b57a9fb8a36d2b50ed4437c880e37325a06d236e92863112359a2b77c27ae1feb772dc78da94392a0740cf324e83897ead4e178"

RPROVIDES:${PN} += "gtk2-engines \
gtk2-engines-lang"

RDEPENDS:${PN} += "gtk2-engine-clearlooks \
gtk2-engine-crux \
gtk2-engine-glide \
gtk2-engine-hcengine \
gtk2-engine-industrial \
gtk2-engine-mist \
gtk2-engine-redmond95 \
gtk2-engine-thinice \
gtk2-theme-clearlooks \
gtk2-theme-crux \
gtk2-theme-industrial \
gtk2-theme-mist \
gtk2-theme-redmond95 \
gtk2-theme-thinice"

inherit rpm
