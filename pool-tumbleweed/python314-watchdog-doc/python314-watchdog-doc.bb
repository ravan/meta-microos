SUMMARY = "Documentation and examples for python314-watchdog"
DESCRIPTION = "This package contains documentation and examples for python314-watchdog."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "python314-watchdog-doc-6.0.0-3.5.noarch.rpm"
RPM_HASH = "9e2f6882f191b04724324adfcfbd0f510e65bc285b3dbc3f270f02f4b05e84e0e828211b8d722b16cc7b5999c05a9ef623b8b171b9a041d5bd484cc113f54d60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-watchdog-doc"

RDEPENDS:${PN} += ""

inherit rpm
