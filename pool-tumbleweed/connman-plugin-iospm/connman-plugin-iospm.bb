SUMMARY = "Intel OSPM plugin for connman"
DESCRIPTION = "Provides Intel OSPM support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.42"

RPM_NAME = "connman-plugin-iospm-1.42-2.16.aarch64.rpm"
RPM_HASH = "c3c92aab71eaa57bce98779c9d41465dfc570d0bedeeaa3c8b218700972d3a45588d83dbbd257e706c675f7abb7a3ce895e6654d2327820087464b5942b71510"

RPROVIDES:${PN} += "connman-plugin-iospm"

RDEPENDS:${PN} += "connman \
ppp"

inherit rpm
