SUMMARY = "Asynchronous API wrapper for the Open Build Service"
DESCRIPTION = "``py-obs`` is a simple asynchronous python API wrapper for the `Open Build \
Service <https://openbuildservice.org/>`_."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.2"

RPM_NAME = "python313-py-obs-0.0.2-1.7.noarch.rpm"
RPM_HASH = "046f0212b9472e4fa149a3476ac0d38cd21ca2c8f1d904c62c0f634c185e7735b000723f1c2bbe9e900cb08d4a0b73cdda52905108a29b0696e63926e572994b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py-obs \
python3.13dist-py-obs \
python313-py-obs \
python3dist-py-obs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
