SUMMARY = "Command line-driven HTTP request builder"
DESCRIPTION = "Command line-driven HTTP request builder"
LICENSE = "ISC"

PV = "0.7.1"

RPM_NAME = "python314-requestbuilder-0.7.1-2.5.noarch.rpm"
RPM_HASH = "ffb1b3979b1b4e23cc00dc14299b5fb441a712a1ac0bd82e74342602c05121036dee4ae352ff905a0baeec9ba9f84b71a01195835b4f499525182da7be3d19f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-requestbuilder \
python314-requestbuilder \
python3dist-requestbuilder"

RDEPENDS:${PN} += "python-abi"

inherit rpm
