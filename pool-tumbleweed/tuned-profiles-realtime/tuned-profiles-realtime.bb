SUMMARY = "Additional tuned profiles targeted to realtime"
DESCRIPTION = "Additional profile(s) for the tuned daemon, targeted to realtime."
LICENSE = "GPL-2.0-or-later"

PV = "2.27.0.0+git.38d4414"

RPM_NAME = "tuned-profiles-realtime-2.27.0.0+git.38d4414-1.2.noarch.rpm"
RPM_HASH = "ca852289c06a4a1577b39f1f6a9862302d43b719a61d8f2662b3fa06508947e85de23f6f252d3dcfaaef479b23b3a7a19bb4f823bcca6e4680da0d1c5cde92ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tuned-profiles-realtime \
tuned-profiles-realtime"

RDEPENDS:${PN} += "tuned"

inherit rpm
