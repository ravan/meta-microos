SUMMARY = "Distrobox branding package for openSUSE"
DESCRIPTION = "This package provides the default configuration for Distrobox for \
openSUSE."
LICENSE = "GPL-3.0-only"

PV = "1.8.2.5"

RPM_NAME = "distrobox-branding-openSUSE-1.8.2.5-3.2.noarch.rpm"
RPM_HASH = "566cbd3518e8f8e2bf8b5c70e118b64345900fac390930bdc0a7b9cf8e253db0b5c93f073ff136583d1d554010b63c715c1f08bbe725ea0469bc47c4f8f2e6c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distrobox-branding \
distrobox-branding-openSUSE"

RDEPENDS:${PN} += "distrobox"

inherit rpm
