SUMMARY = "Useragent faker package for Python"
DESCRIPTION = "Useragent faker with real world database."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python314-fake-useragent-2.2.0-1.5.noarch.rpm"
RPM_HASH = "16eacf93026029d43d3113f1ae9460ebd6c2a01adb4cf5dbf94ca57b94c6327e5702ec76442431f826e3a6a63584081f97910f29e81555d2bf022418eec3bb58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fake-useragent \
python314-fake-useragent \
python3dist-fake-useragent"

RDEPENDS:${PN} += "python-abi"

inherit rpm
