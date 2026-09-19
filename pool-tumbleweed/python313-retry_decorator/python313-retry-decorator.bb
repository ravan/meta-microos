SUMMARY = "Retry Decorator"
DESCRIPTION = "Decorator to support retry when an exception occurs."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python313-retry_decorator-1.1.1-2.5.noarch.rpm"
RPM_HASH = "d2ff264da3b30c00b7cefe1fb252ad5f9a5b0daa2aea18a6512894a677a81d5eb1ccd7a35d043a9524c28fc33a2a9c71096a8602ca4bb1debd067ffcf639d235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-retry-decorator \
python3.13dist-retry-decorator \
python313-retry-decorator \
python3dist-retry-decorator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
