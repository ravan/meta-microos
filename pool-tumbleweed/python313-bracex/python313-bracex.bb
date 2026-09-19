SUMMARY = "Bash style brace expander"
DESCRIPTION = "Bash style brace expander."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python313-bracex-3.0.1-1.1.noarch.rpm"
RPM_HASH = "1ee9d45b270bc556be022af13330a6aed399cec92e014eaa13482139db0b266227ed451d6f7b084587d3dd263047bd70deaa3fc86de083d4b21bb5fb1fa32c33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bracex \
python3.13dist-bracex \
python313-bracex \
python3dist-bracex"

RDEPENDS:${PN} += "python-abi"

inherit rpm
