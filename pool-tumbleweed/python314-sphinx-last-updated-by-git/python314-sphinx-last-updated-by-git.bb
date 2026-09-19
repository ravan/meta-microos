SUMMARY = "Get the 'last updated' time for each Sphinx page from Git"
DESCRIPTION = "Get the 'last updated' time for each Sphinx page from Git"
LICENSE = "BSD-2-Clause"

PV = "0.3.8"

RPM_NAME = "python314-sphinx-last-updated-by-git-0.3.8-1.2.noarch.rpm"
RPM_HASH = "ea35aeb87cf9e5ca0addcc41d3fdad81e5cf6d3b552128d37f340bcded689c2a2a9935ab837a21ee898fc382140c6e603a1247234413324d03867ca4ea735712"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-last-updated-by-git \
python314-sphinx-last-updated-by-git \
python3dist-sphinx-last-updated-by-git"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
