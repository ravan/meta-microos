SUMMARY = "Flake8 lint for quotes"
DESCRIPTION = "Flake8 Extension to lint for quotes."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "python314-flake8-quotes-3.4.0-2.5.noarch.rpm"
RPM_HASH = "0d26e33836aea9cd8ee1c344be341b4b2d44bb679ef1c2d5b0fa0a62837eab44a5d5ff59357f24b90c4ed69372dd3926683eb07d6d9f6deaba40e4a26e733130"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flake8-quotes \
python314-flake8-quotes \
python3dist-flake8-quotes"

RDEPENDS:${PN} += "python-abi \
python314-flake8"

inherit rpm
