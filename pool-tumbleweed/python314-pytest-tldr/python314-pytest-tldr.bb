SUMMARY = "A pytest plugin that limits the output to just the things you need"
DESCRIPTION = "A pytest plugin that limits the output to just the things you need."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "python314-pytest-tldr-0.2.5-4.4.noarch.rpm"
RPM_HASH = "edc4087cdaa1b0210b6ee055867069e0f7a054a1a42d76cfa2dea5782c9617536fca57de6b5cec6dfbcf337d78d0acd651192576408e9f923a627da6b0ae5c55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-tldr \
python314-pytest-tldr \
python3dist-pytest-tldr"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
