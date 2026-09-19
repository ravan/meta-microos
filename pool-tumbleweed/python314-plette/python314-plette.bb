SUMMARY = "Structured Pipfile and Pipfile.lock models"
DESCRIPTION = "Structured Pipfile and Pipfile.lock models."
LICENSE = "ISC"

PV = "2.2.2"

RPM_NAME = "python314-plette-2.2.2-1.1.noarch.rpm"
RPM_HASH = "365ba78909f2a7ac174097c6680714b94576ff6c5b6a39c40f1c60762abf95ba805f63b802ca712bb767fc60f5f9b0f7855e34d4113757f89f47eb7663885002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-plette \
python314-plette \
python3dist-plette"

RDEPENDS:${PN} += "python-abi \
python314-tomlkit"

inherit rpm
