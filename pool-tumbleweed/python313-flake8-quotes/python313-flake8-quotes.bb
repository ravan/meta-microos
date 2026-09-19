SUMMARY = "Flake8 lint for quotes"
DESCRIPTION = "Flake8 Extension to lint for quotes."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "python313-flake8-quotes-3.4.0-2.5.noarch.rpm"
RPM_HASH = "e60861f7825d535b733e5296d615bcbf9d600e7448ef6023277686ba0bac0b22a8165e0e92c55e36322ee518232de54425e5b518d07dbd87ce62b69d3eaf3c48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-quotes \
python3.13dist-flake8-quotes \
python313-flake8-quotes \
python3dist-flake8-quotes"

RDEPENDS:${PN} += "python-abi \
python313-flake8"

inherit rpm
