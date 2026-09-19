SUMMARY = "Icinga L10n"
DESCRIPTION = "L10n (short for Localization) provides all translations available for Icinga."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "icinga-l10n-1.2.0-1.10.noarch.rpm"
RPM_HASH = "507e3b7fbc2d1b808b0447bd139f2e6d5378e9b5c0297cc48e20513c3d47b5e3c6c565a6dcbbe70d61e8e481ee8fe661713f3abd43765c5967431a9f287f966b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icinga-l10n"

RDEPENDS:${PN} += ""

inherit rpm
