SUMMARY = "Additional tuned profile(s) targeted to SAP HANA loads"
DESCRIPTION = "Additional profile(s) for the tuned daemon, targeted to SAP HANA loads."
LICENSE = "GPL-2.0-or-later"

PV = "2.27.0.0+git.38d4414"

RPM_NAME = "tuned-profiles-sap-hana-2.27.0.0+git.38d4414-1.2.noarch.rpm"
RPM_HASH = "4ae6208c2d44d61ac2a1811ac9ae48e49044af3786259ea31a1a772d24df49d2a71cad513ed0a07537063771d9e764a063e90ff6080d772e9489842c038ed9ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-profiles-sap-hana"

RDEPENDS:${PN} += "tuned"

inherit rpm
