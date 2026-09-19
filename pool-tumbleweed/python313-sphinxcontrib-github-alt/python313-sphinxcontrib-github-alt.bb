SUMMARY = "Sphinx extension to link to GitHub issues, pull requests, commits and users"
DESCRIPTION = "A Sphinx extension to link to GitHub issues, pull requests, commits \
and users for a particular project. \
 \
To use this extension, add it to the extensions list in conf.py, \
and set the variable github_project_url:"
LICENSE = "BSD-2-Clause"

PV = "1.2"

RPM_NAME = "python313-sphinxcontrib-github-alt-1.2-3.1.noarch.rpm"
RPM_HASH = "6a574fc9a9d3e60c53090a21d2c49f6b2244ef9487c3b9ad0026faaa835203acfa8ff8dba82d30aa07dc9acceea16118296b64122486834d6511acaadf9ca2e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-github-alt \
python3.13dist-sphinxcontrib-github-alt \
python313-sphinxcontrib-github-alt \
python3dist-sphinxcontrib-github-alt"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx \
python313-docutils"

inherit rpm
