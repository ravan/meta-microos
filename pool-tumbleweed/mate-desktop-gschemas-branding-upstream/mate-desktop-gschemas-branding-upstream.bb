SUMMARY = "MATE Desktop GSchemas -- Upstream default settings"
DESCRIPTION = "This package contains the upstream default settings for \
MATE Desktop GSchemas."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.2"

RPM_NAME = "mate-desktop-gschemas-branding-upstream-1.28.2-1.13.noarch.rpm"
RPM_HASH = "026a3692c7e5ade6e215b7a8635e56f5a77227a335c5306518689b8ef661233b29f83897c52f0cd967ed74488a12a1dbf6374810b8bcaf38aa029c9b04494b03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-desktop-gschemas-branding \
mate-desktop-gschemas-branding-upstream"

RDEPENDS:${PN} += "mate-desktop-gschemas"

inherit rpm
