SUMMARY = "Common targetcli-fb subpackage for either flavor of Python"
DESCRIPTION = "targetcli-fb-common is the invariant base package needed by \
all python-version-dependant packages, such as python3*-targetcli-fb."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "targetcli-fb-common-3.0.1-2.6.noarch.rpm"
RPM_HASH = "ffec34777f03ba52bf2f0c6e4517438bc4d7cc5e4fa56926d300b2420d88889c93c1ccc6c606c9c9eaff1f68ad559dd600edf90e7f9b16f0e49697f93845e81c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python313-targetcli-fb-common \
python314-targetcli-fb-common \
targetcli-fb-common"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
