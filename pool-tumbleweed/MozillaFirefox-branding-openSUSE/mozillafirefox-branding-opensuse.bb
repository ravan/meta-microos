SUMMARY = "openSUSE branding of MozillaFirefox"
DESCRIPTION = "This package provides openSUSE look and feel for Firefox."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "68"

RPM_NAME = "MozillaFirefox-branding-openSUSE-68-6.1.aarch64.rpm"
RPM_HASH = "acf9348546e58eaffae6ad9a531ed80afbb7b3cc0887c2ca9f75d04e1b9a06c810cff68134d43d3442ba154ccd310f737b35eafbbeeda57b0d35199273215cd9"

RPROVIDES:${PN} += "MozillaFirefox-branding \
MozillaFirefox-branding-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
