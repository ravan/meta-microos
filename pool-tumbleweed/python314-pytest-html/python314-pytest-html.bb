SUMMARY = "Pytest plugin for generating HTML reports"
DESCRIPTION = "A plugin for pytest that generates a HTML report for test results."
LICENSE = "MPL-2.0"

PV = "4.2.0"

RPM_NAME = "python314-pytest-html-4.2.0-5.1.noarch.rpm"
RPM_HASH = "6abcd932acf22b3c9a49874ebacddeb68e580b8b6ca5f24aa68601001711ea3763df268eb8490c7f2b6fbf8b3d7d221249eb699fe261e0d43788d5dab92c9c8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-html \
python314-pytest-html \
python3dist-pytest-html"

RDEPENDS:${PN} += "python-abi \
python314-Jinja2 \
python314-pytest \
python314-pytest-metadata"

inherit rpm
