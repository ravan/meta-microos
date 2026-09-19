SUMMARY = "Translations for package NetworkManager-strongswan"
DESCRIPTION = "Provides translations for the 'NetworkManager-strongswan' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.5"

RPM_NAME = "NetworkManager-strongswan-lang-1.6.5-1.1.noarch.rpm"
RPM_HASH = "74f426bdccb9e105b3ff12386da8da59512af12e8c21fbb3ed6ada6ada991a8183783208ae84530bd1164bb0ebee054dd4c81ef2586ae3ebcdea35b7d8a178c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-strongswan-lang \
NetworkManager-strongswan-lang-all \
locale-NetworkManager-strongswan-de \
locale-NetworkManager-strongswan-ka"

RDEPENDS:${PN} += "NetworkManager-strongswan"

inherit rpm
