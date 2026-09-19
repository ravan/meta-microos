SUMMARY = "Mock time date for Python"
DESCRIPTION = "FreezeGun is a library that allows your python tests to travel through \
time by mocking the datetime module."
LICENSE = "Apache-2.0"

PV = "1.5.5"

RPM_NAME = "python313-freezegun-1.5.5-1.4.noarch.rpm"
RPM_HASH = "8df3656d362ba94266c19d40e8331b033c2b81247de2d15063f5fb56407ad3ee4264ba2fc7ab3515344fc1d8d5733db12aa7032ac1acb591621a352dfaa6adad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-freezegun \
python3.13dist-freezegun \
python313-freezegun \
python3dist-freezegun"

RDEPENDS:${PN} += "python-abi \
python313 \
python313-python-dateutil"

inherit rpm
