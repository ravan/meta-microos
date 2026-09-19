SUMMARY = "Importing Python modules by physical file path"
DESCRIPTION = "Importing Python modules by physical file path."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python314-magicalimport-0.9.2-1.6.noarch.rpm"
RPM_HASH = "46002dd7e2f44406fa1786bdcd4d7ca9c8b54a67c8acce949216cbaa1f755991c185c42f183f0a2fdce51af7b7e99d152635dc4ec58160a1bbb1a962f11b322c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-magicalimport \
python314-magicalimport \
python3dist-magicalimport"

RDEPENDS:${PN} += "python-abi"

inherit rpm
