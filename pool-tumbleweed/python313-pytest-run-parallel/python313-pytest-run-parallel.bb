SUMMARY = "A simple pytest plugin to run tests concurrently"
DESCRIPTION = "A simple pytest plugin to run tests concurrently"
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python313-pytest-run-parallel-0.10.0-1.1.noarch.rpm"
RPM_HASH = "c04d02a62469fd4c2f9bf8c4eb0ca0fc619b0cbd98ad7ea58fc286ba194f37e7cd34c5ef3f5f9d020b47364f2940bd9e1de931556cabed51380cf02fc3546c1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-run-parallel \
python3.13dist-pytest-run-parallel \
python313-pytest-run-parallel \
python3dist-pytest-run-parallel"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
