SUMMARY = "Module to resolve abstract dependencies into concrete ones"
DESCRIPTION = "A Python module to resolve abstract dependencies into concrete ones."
LICENSE = "ISC"

PV = "1.2.1"

RPM_NAME = "python313-resolvelib-1.2.1-1.4.noarch.rpm"
RPM_HASH = "e296953d6bf9dc7f9681e1cc7f2668b899077adc6003dbe983fe84719a7b18510074e60885350bc6b98022443753e6c9c28e3afd9e7812cfba6ecbc0f2cf3995"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-resolvelib \
python3.13dist-resolvelib \
python313-resolvelib \
python3dist-resolvelib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
