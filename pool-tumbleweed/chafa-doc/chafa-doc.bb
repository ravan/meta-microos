SUMMARY = "Chafa documentation"
DESCRIPTION = "Documentation for chafa."
LICENSE = "LGPL-3.0-or-later"

PV = "1.18.2"

RPM_NAME = "chafa-doc-1.18.2-1.3.noarch.rpm"
RPM_HASH = "a945d25930f075427d1e45290b625353893541d94a64eaca4b47c060906fe260f140a3ede5192a49d49af7a34f98037e14600d9e8ec2e18ac6167ad94208701a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chafa-doc"

RDEPENDS:${PN} += ""

inherit rpm
