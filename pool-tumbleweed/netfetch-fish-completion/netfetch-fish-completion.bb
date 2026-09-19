SUMMARY = "Fish Completion for netfetch"
DESCRIPTION = "Fish command line completion support for netfetch."
LICENSE = "MIT"

PV = "0.5.4"

RPM_NAME = "netfetch-fish-completion-0.5.4-1.10.noarch.rpm"
RPM_HASH = "81d9ff7689258618bcba6bbd143299e3c1dea5da08d9103df5189f3e331eaf79559b128655dd6856eb7bd3d6199f007bf52c749e06efd24d1382bf6147348ccc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netfetch-fish-completion"

RDEPENDS:${PN} += "netfetch"

inherit rpm
