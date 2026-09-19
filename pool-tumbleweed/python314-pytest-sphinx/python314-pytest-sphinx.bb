SUMMARY = "Doctest plugin for pytest with support for Sphinx-specific doctest-directives"
DESCRIPTION = "Doctest plugin for pytest with support for Sphinx-specific doctest-directives."
LICENSE = "BSD-3-Clause"

PV = "0.7.1"

RPM_NAME = "python314-pytest-sphinx-0.7.1-1.3.noarch.rpm"
RPM_HASH = "8efc68793107a447282fa9929fe425da450d2f02a7fbb0af445da59f46610a92c3cea2284be1bfa6295a3d06a06b6202fa63e0480cda88456e713a33ae0536a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-sphinx \
python314-pytest-sphinx \
python3dist-pytest-sphinx"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
