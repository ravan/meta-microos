SUMMARY = "System power status information in Python"
DESCRIPTION = "Python module that allows you to get power and battery status of the system."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python313-power-1.4-4.5.noarch.rpm"
RPM_HASH = "c037ed8d9e676782788952a37b811eab3f4126d263da98ab593860b4d64d2fe04d1bf0418e566875237a735684defb40cbd42f86590049313f58f97cfe4acc27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-power \
python3.13dist-power \
python313-power \
python3dist-power"

RDEPENDS:${PN} += "python-abi"

inherit rpm
