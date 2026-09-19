SUMMARY = "Flake8 noqa comment validation"
DESCRIPTION = "Flake8 noqa comment validation"
LICENSE = "LGPL-3.0-only"

PV = "1.5.0"

RPM_NAME = "python314-flake8-noqa-1.5.0-1.4.noarch.rpm"
RPM_HASH = "e648a95a58e15134b4a7b878dbd55fe3c6e14a2f9b87213b4b40ace31a307c57e26ca67b875f4b268d6d67f5af80fda5426196e976b5c7a926a5daadde2ef152"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flake8-noqa \
python314-flake8-noqa \
python3dist-flake8-noqa"

RDEPENDS:${PN} += "python-abi \
python314-flake8 \
python314-typing-extensions"

inherit rpm
