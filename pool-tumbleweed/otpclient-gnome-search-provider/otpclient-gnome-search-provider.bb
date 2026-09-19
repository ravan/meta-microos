SUMMARY = "GNOME Shell search provider for otpclient"
DESCRIPTION = "GNOME Shell search provider integration for otpclient, allowing OTP \
codes to be looked up directly from the Activities overview."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.8"

RPM_NAME = "otpclient-gnome-search-provider-5.1.8-1.1.noarch.rpm"
RPM_HASH = "627900321a283f77f32b2cd7d7f61027b68848eb7b3a6a4f2f4b95af2d2ab4443df635e4a149bce1f03857223b6c210c66be3b5ef719dbcf3036c97c94070bca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "otpclient-gnome-search-provider"

RDEPENDS:${PN} += "gnome-shell \
otpclient"

inherit rpm
