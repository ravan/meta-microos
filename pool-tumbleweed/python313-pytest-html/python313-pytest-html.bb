SUMMARY = "Pytest plugin for generating HTML reports"
DESCRIPTION = "A plugin for pytest that generates a HTML report for test results."
LICENSE = "MPL-2.0"

PV = "4.2.0"

RPM_NAME = "python313-pytest-html-4.2.0-5.1.noarch.rpm"
RPM_HASH = "36a59770cb986db37911a8e48634f560961656eae87eec08ef96c33de181bff49ec6ae7eedfe52724c9b81f98ceeb08384cfa407a0876ccc86d511f17f54cd49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-html \
python3.13dist-pytest-html \
python313-pytest-html \
python3dist-pytest-html"

RDEPENDS:${PN} += "python-abi \
python313-Jinja2 \
python313-pytest \
python313-pytest-metadata"

inherit rpm
