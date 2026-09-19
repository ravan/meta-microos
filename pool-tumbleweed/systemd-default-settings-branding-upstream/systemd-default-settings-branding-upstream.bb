SUMMARY = "Restore upstream systemd defaults"
DESCRIPTION = "Installing this package restores some of the upstream default settings \
by uninstalling all drop-ins shipped by systemd-default-settings and its branding sub \
package."
LICENSE = "GPL-2.0-or-later"

PV = "0.10"

RPM_NAME = "systemd-default-settings-branding-upstream-0.10-1.7.noarch.rpm"
RPM_HASH = "1bf4dab6fbc3d99f3d4903d452bad6fd57e688b55c61cdaeff3fe2c5825eaf32ad71ddc95bd938a6400a5c127343aa7720031b6a41d8c3c044520c714456e077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-default-settings-branding \
systemd-default-settings-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
