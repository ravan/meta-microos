SUMMARY = "GRC blocks for gr-iqbal"
DESCRIPTION = "GNU Radio Companion (GRC) definitions for the \
gr-iqbal I/Q balancing block."
LICENSE = "GPL-2.0-only"

PV = "0.39.0git20250425"

RPM_NAME = "gr-iqbal-grc-0.39.0git20250425-1.5.noarch.rpm"
RPM_HASH = "8b5027ee75723baae7b647db7fd4214a77d75a51fcc6f04b9a1eff8709b62e7c38bd55d7a621200534d14d71b3e57e53e2e264e186c205b7e2b4c456b5ffcd77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gr-iqbal-grc"

RDEPENDS:${PN} += "libgnuradio-iqbalance3-9-0"

inherit rpm
