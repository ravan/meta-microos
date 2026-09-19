SUMMARY = "Default upstream configuration for NetworkManager"
DESCRIPTION = "This package provides the default upstream configuration for \
NetworkManager. Specifically, \
it is not configured for connection checking against \
http://conncheck.opensuse.org. For, the version with connection \
checking, install NetworkManager-branding-openSUSE."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.56.1"

RPM_NAME = "NetworkManager-branding-upstream-1.56.1-4.1.noarch.rpm"
RPM_HASH = "ae10c528ffffa5e0d5a822955639811d7b2469e2af6f5aa014d08e4e230e2b43a9c6f4c197642fc1b115b87ceb411ae51c1febb6274f9b1f60a72ec7a0efb18a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-branding \
NetworkManager-branding-upstream"

RDEPENDS:${PN} += "NetworkManager"

inherit rpm
