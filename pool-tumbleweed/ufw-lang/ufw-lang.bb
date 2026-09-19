SUMMARY = "Translations for package ufw"
DESCRIPTION = "Provides translations for the 'ufw' package."
LICENSE = "GPL-3.0-only"

PV = "0.36.2"

RPM_NAME = "ufw-lang-0.36.2-2.4.noarch.rpm"
RPM_HASH = "7fe5bac0f53117d9dc50b486c07d2500479ce779fd0d4278dca5f7f38a52a3c9c371ce0617f8c7a553c659759673dda010fca6209ed6c3cfb70a4b3d9483b0fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ufw-lang \
ufw-lang-all"

RDEPENDS:${PN} += "ufw"

inherit rpm
