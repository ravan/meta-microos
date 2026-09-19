SUMMARY = "Additional argparse types and actions"
DESCRIPTION = "Additional argparse types and actions."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python314-argparse_addons-0.12.0-1.14.noarch.rpm"
RPM_HASH = "946d151b080c1b2d2e510db1d31e75e43e26233f1c1abee31a8c1b011fd6133592dd4d7cb247cddf4581e8a45e341048e5c16af6471853f352099791b4d3f5b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-argparse-addons \
python314-argparse-addons \
python3dist-argparse-addons"

RDEPENDS:${PN} += "python-abi"

inherit rpm
