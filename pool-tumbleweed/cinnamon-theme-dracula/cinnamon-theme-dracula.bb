SUMMARY = "Dracula Cinnamon themes"
DESCRIPTION = "This package contains the cinnamon themes for Dracula theme."
LICENSE = "GPL-3.0-only"

PV = "4.0.0+git146.2618a03"

RPM_NAME = "cinnamon-theme-dracula-4.0.0+git146.2618a03-1.2.noarch.rpm"
RPM_HASH = "be638280e7c6a4779c383f765e39215023b37e9bc9090d111f1778cf4b1481b274c769ad06d6623e7875326ca99b1a3d186ffb0ec5dd9df00372a29a4a273943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-theme-dracula \
dracula-gtk-theme"

RDEPENDS:${PN} += "cinnamon \
metatheme-dracula-common"

inherit rpm
