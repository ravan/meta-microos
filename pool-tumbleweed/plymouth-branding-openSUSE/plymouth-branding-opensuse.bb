SUMMARY = "openSUSE Tumbleweed branding for Plymouth bootsplash"
DESCRIPTION = "openSUSE Tumbleweed branding for the plymouth bootsplash"
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20240405"

RPM_NAME = "plymouth-branding-openSUSE-84.87.20240405-5.5.noarch.rpm"
RPM_HASH = "ea88b5ff734dd01570f4cda673e263fc4f9ee596018ddee7a8299c72286bc84b4af2232889e9dc044cea8978a5537074a27c95439fa2aa700721393b56c4354f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-branding \
plymouth-branding-openSUSE"

RDEPENDS:${PN} += "plymouth-scripts \
plymouth-theme-bgrt"

inherit rpm
