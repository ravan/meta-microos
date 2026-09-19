SUMMARY = "Get the 'last updated' time for each Sphinx page from Git"
DESCRIPTION = "Get the 'last updated' time for each Sphinx page from Git"
LICENSE = "BSD-2-Clause"

PV = "0.3.8"

RPM_NAME = "python313-sphinx-last-updated-by-git-0.3.8-1.2.noarch.rpm"
RPM_HASH = "436fa4606c1cfbb4419f5ae39839897e16fed574cbd8a79812cd2024b65af70cb3bcd04e3d15da15d2491c50b34c9965d180c610cec38ca92df2dfe1127144ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-last-updated-by-git \
python3.13dist-sphinx-last-updated-by-git \
python313-sphinx-last-updated-by-git \
python3dist-sphinx-last-updated-by-git"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
