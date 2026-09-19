SUMMARY = "Library to work with PuppetDB's REST API"
DESCRIPTION = "This library is a wrapper around the REST API providing some convinience functions and objects to request and hold data from PuppetDB. \
More information: https://github.com/nedap/pypuppetdb"
LICENSE = "Apache-2.0"

PV = "2.5.1"

RPM_NAME = "python314-pypuppetdb-2.5.1-3.5.noarch.rpm"
RPM_HASH = "3c43f5a9fd61350cbb30273df77a53134dd45c49a30589d1c1d700d118a4f4052e85843e5366f656bd2b30731cc0c223b8ea6200ad71431c28b84042f7be660d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pypuppetdb \
python314-pypuppetdb \
python3dist-pypuppetdb"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
