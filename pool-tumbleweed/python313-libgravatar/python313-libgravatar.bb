SUMMARY = "A library that provides a Python 3 interface for the Gravatar API"
DESCRIPTION = "A library that provides a Python 3 interface for the Gravatar API."
LICENSE = "GPL-3.0-only"

PV = "1.0.4"

RPM_NAME = "python313-libgravatar-1.0.4-2.9.noarch.rpm"
RPM_HASH = "38c53730ea0c9b068906e58c9836afe7bed839fe37b88c1586398c895ee89d8a438b6d436f5d7b15b1f1cfdd5a762d726aea67246745f43083d7716a035aaec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libgravatar \
python3.13dist-libgravatar \
python313-libgravatar \
python3dist-libgravatar"

RDEPENDS:${PN} += "python-abi"

inherit rpm
