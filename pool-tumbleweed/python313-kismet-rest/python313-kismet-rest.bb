SUMMARY = "Python wrapper for the Kismet REST interface"
DESCRIPTION = "Simplified Python API for the Kismet REST interface."
LICENSE = "GPL-2.0-only"

PV = "2019.05.02"

RPM_NAME = "python313-kismet-rest-2019.05.02-3.5.noarch.rpm"
RPM_HASH = "e6ef727341b63e3ae62e1eddd420c7cf466c6cd27368da119157c3af11366f031d3a38d651ebd53ee3eddf05bfdd9aa0fdbb4a8dc5aeefba08a0cdfe6a6adf00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kismet-rest \
python3.13dist-kismet-rest \
python313-kismet-rest \
python3dist-kismet-rest"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
