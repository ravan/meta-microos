SUMMARY = "Additional tuned profiles targeted to Atomic"
DESCRIPTION = "Additional profile(s) for the tuned daemon, targeted to Atomic host and guest."
LICENSE = "GPL-2.0-or-later"

PV = "2.27.0.0+git.38d4414"

RPM_NAME = "tuned-profiles-atomic-2.27.0.0+git.38d4414-1.2.noarch.rpm"
RPM_HASH = "c97b971f66de84600eade20d7ad06b12c476335cab2e5f3924b63c910b16a510763d01679d07c8c75d70bcf964751c33e990944c267e5a8967ea952579c76c9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-profiles-atomic"

RDEPENDS:${PN} += "tuned"

inherit rpm
