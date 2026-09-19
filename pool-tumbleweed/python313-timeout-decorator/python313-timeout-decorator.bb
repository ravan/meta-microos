SUMMARY = "Python timeout decorator"
DESCRIPTION = "Python timeout decorator."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python313-timeout-decorator-0.5.0-3.2.noarch.rpm"
RPM_HASH = "288d3bd7cfabce6d3ff79a8a3829b63fe43e69ab25eca699458c2eff17edddd1e6a25d931ae9a1d76d60c33deaf6e8d07aa426c173235af53b4639d820d79533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-timeout-decorator \
python3.13dist-timeout-decorator \
python313-timeout-decorator \
python3dist-timeout-decorator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
