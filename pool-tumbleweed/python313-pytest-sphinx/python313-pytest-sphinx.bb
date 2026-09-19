SUMMARY = "Doctest plugin for pytest with support for Sphinx-specific doctest-directives"
DESCRIPTION = "Doctest plugin for pytest with support for Sphinx-specific doctest-directives."
LICENSE = "BSD-3-Clause"

PV = "0.7.1"

RPM_NAME = "python313-pytest-sphinx-0.7.1-1.3.noarch.rpm"
RPM_HASH = "5447300e403f328cb5779615c5085d42c7655e73020503fe120b97e579b12cc1e58efe3fa42206a5ec9d155c5ccb90e4f7e645cc3c78afc17986e68af45280c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-sphinx \
python3.13dist-pytest-sphinx \
python313-pytest-sphinx \
python3dist-pytest-sphinx"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
