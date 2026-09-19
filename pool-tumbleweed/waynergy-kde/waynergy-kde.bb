SUMMARY = "KDE desktop integration"
DESCRIPTION = "An implementation of a synergy client for wayland compositors. Based \
on the upstream uSynergy library (heavily modified for more protocol \
support and a bit of paranoia). \
 \
Contains waynergy.desktop must be installed, and the path must be \
absolute or the required interface will not be offered."
LICENSE = "MIT"

PV = "0.17+0"

RPM_NAME = "waynergy-kde-0.17+0-1.13.noarch.rpm"
RPM_HASH = "d68a65c8e80900591c0a05188e44a55032e64b393f995535a100bae2e068b94930a7f2947d0a1e1a7c93bff3446f7e6dd2b290572a877d48d6fba497a06b3082"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "waynergy-kde"

RDEPENDS:${PN} += "waynergy"

inherit rpm
