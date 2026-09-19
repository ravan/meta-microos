SUMMARY = "openSUSE Branding of thunar-volman"
DESCRIPTION = "This package provides the openSUSE look and feel for the Thunar Volume Manager."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.20.0+git1.d2555b3"

RPM_NAME = "thunar-volman-branding-openSUSE-4.20.0+git1.d2555b3-3.10.noarch.rpm"
RPM_HASH = "310c9c1d29ba178cd9df040952d5211be52f13abd74421f5b85995b8614fb24cc70de415bd0bbda7f5b270fa8ffda2510608b9ad19f7bb54561e9ba41c282141"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-thunar-volman-branding-openSUSE \
thunar-volman-branding \
thunar-volman-branding-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
