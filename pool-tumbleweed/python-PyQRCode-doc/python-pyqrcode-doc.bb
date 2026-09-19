SUMMARY = "Documentation files for python-PyQRCode"
DESCRIPTION = "HTML Documentation for python-PyQRCode."
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "python-PyQRCode-doc-1.3.6-7.5.noarch.rpm"
RPM_HASH = "af8979263a5624352c2a62714c05f71e35b058b950c309dcef79951972921ffb2f180232155e4e5607280baa75f3ede4494e58e33cb296f12ec6ef299e155d9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-PyQRCode-doc"

RDEPENDS:${PN} += ""

inherit rpm
