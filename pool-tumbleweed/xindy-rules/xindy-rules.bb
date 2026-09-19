SUMMARY = "Rule files for Xindy"
DESCRIPTION = "xindy is an index processor that can be used to generate book-like \
indexes for arbitrary document-preparation systems. \
 \
This package contains the rule files (the knowledge base) of xindy."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.1"

RPM_NAME = "xindy-rules-2.5.1-3.13.noarch.rpm"
RPM_HASH = "6a4ce7a1f66a236aef79a2d7b8393c1f955c4f1fe4cbae82565d900595ed5ac2dd2076d575f9efa453f6637d536335957ce73891c59ff319976f353b79758de3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xindy-rules"

RDEPENDS:${PN} += ""

inherit rpm
