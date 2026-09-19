SUMMARY = "Python timeout decorator"
DESCRIPTION = "Python timeout decorator."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python314-timeout-decorator-0.5.0-3.2.noarch.rpm"
RPM_HASH = "378951bfd7df4610d7f736934d493f0d250850e8e0041fce780386b58d1dfba67a3e6e8e7836dda5e05697257ee3eda86a511496f73db436434706cae9995640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-timeout-decorator \
python314-timeout-decorator \
python3dist-timeout-decorator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
