SUMMARY = "Sphinx extension to link to GitHub issues, pull requests, commits and users"
DESCRIPTION = "A Sphinx extension to link to GitHub issues, pull requests, commits \
and users for a particular project. \
 \
To use this extension, add it to the extensions list in conf.py, \
and set the variable github_project_url:"
LICENSE = "BSD-2-Clause"

PV = "1.2"

RPM_NAME = "python314-sphinxcontrib-github-alt-1.2-3.1.noarch.rpm"
RPM_HASH = "22b8546313cfa7c296398f76dc0cb0108beec5dccb5881432f6b48f1af65a34fe74c2accc14ac336d0b0b8de3991ecdf3ffeb12dba831c87a5034f9a5b7d46e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-github-alt \
python314-sphinxcontrib-github-alt \
python3dist-sphinxcontrib-github-alt"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx \
python314-docutils"

inherit rpm
