SUMMARY = "Avocado Plugin for Execution of golang tests"
DESCRIPTION = "This plugin allows Avocado to list golang tests, and if golang is installed, \
to also run them."
LICENSE = "GPL-2.0-only"

PV = "113.0"

RPM_NAME = "python3-avocado-plugins-golang-113.0-1.2.noarch.rpm"
RPM_HASH = "64512e1aea595387e27446203d32404240189a9ba1f23b38eeeced507a389e82d574de94e304ba30093d7ba8b457f92e487b0024d1b3971fe817d7721a6094b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-golang \
python3.13dist-avocado-framework-plugin-golang \
python3dist-avocado-framework-plugin-golang"

RDEPENDS:${PN} += "go \
python-abi \
python3-avocado"

inherit rpm
