SUMMARY = "oslo.privsep documentation"
DESCRIPTION = "Documentation for oslo.privsep"
LICENSE = "Apache-2.0"

PV = "3.12.0"

RPM_NAME = "python-oslo.privsep-doc-3.12.0-1.1.noarch.rpm"
RPM_HASH = "1d8c2165fa561b2434a73fff99b499396f1e59933e33af520cd15ae86c00ea3ee3372706273cf02b118bcbd3f38bc411ef12e51099a0611fef2bdcaea5f8d360"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.privsep-doc"

RDEPENDS:${PN} += ""

inherit rpm
