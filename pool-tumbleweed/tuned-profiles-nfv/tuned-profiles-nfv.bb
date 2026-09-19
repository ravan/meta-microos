SUMMARY = "Additional tuned profiles targeted to Network Function Virtualization (NFV)"
DESCRIPTION = "Additional profile(s) for the tuned daemon, targeted to Network Function Virtualization (NFV)."
LICENSE = "GPL-2.0-or-later"

PV = "2.27.0.0+git.38d4414"

RPM_NAME = "tuned-profiles-nfv-2.27.0.0+git.38d4414-1.2.noarch.rpm"
RPM_HASH = "5d565541db3ed39059b140b84e8e3a9c74083931a3899a729379e7638a55d0326b488577865daf4690fa2878790a159de0dbba51f3870114b4b1a391f55d6252"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tuned-profiles-nfv \
tuned-profiles-nfv"

RDEPENDS:${PN} += "/usr/bin/bash \
tuned"

inherit rpm
