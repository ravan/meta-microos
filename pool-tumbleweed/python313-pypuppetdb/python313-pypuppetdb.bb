SUMMARY = "Library to work with PuppetDB's REST API"
DESCRIPTION = "This library is a wrapper around the REST API providing some convinience functions and objects to request and hold data from PuppetDB. \
More information: https://github.com/nedap/pypuppetdb"
LICENSE = "Apache-2.0"

PV = "2.5.1"

RPM_NAME = "python313-pypuppetdb-2.5.1-3.5.noarch.rpm"
RPM_HASH = "8d1835aa91eecb75b14dc3737c281dc295196b89c98e3fa5780b6b90d4e21e9b24a6f8280a4c0a325fa1a77b92cd86e185e2da9a45037a822e0d4634edb4028c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypuppetdb \
python3.13dist-pypuppetdb \
python313-pypuppetdb \
python3dist-pypuppetdb"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
