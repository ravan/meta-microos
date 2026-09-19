SUMMARY = "Common python-rtslib-fb subpackage for all Python 3 versions"
DESCRIPTION = "python-rtslib-fb-common is the invariant base package needed by all \
version of python3*-rtslib-fb."
LICENSE = "Apache-2.0"

PV = "2.2.2"

RPM_NAME = "python-rtslib-fb-common-2.2.2-3.6.noarch.rpm"
RPM_HASH = "32932405281c72b964dfcae27c84378369e6858b662cd761d8cf5051827a4a31dd5ddb69eb612432b51bdd9602287f10454bd626ca0e5040bba30c785b1728fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-rtslib-fb-common"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
