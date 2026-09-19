SUMMARY = "Phabricator API Bindings"
DESCRIPTION = "Phabricator API Bindings"
LICENSE = "Apache-2.0"

PV = "0.9.1"

RPM_NAME = "python314-phabricator-0.9.1-2.5.noarch.rpm"
RPM_HASH = "a3c83db965e6453fa8147b284b9f9487b8df9f217e05775e962ec363e4c6778d69365e87b3865c2091d9edaf2f2ff13d00eef72c82fbd967e6a27876f95aec81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-phabricator \
python314-phabricator \
python3dist-phabricator"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
