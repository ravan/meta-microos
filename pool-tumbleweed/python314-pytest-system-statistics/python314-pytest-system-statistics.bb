SUMMARY = "Pytest plugin to track and report system usage statistics"
DESCRIPTION = "Pytest plugin to track and report system usage statistics"
LICENSE = "Apache-2.0"

PV = "1.0.2"

RPM_NAME = "python314-pytest-system-statistics-1.0.2-1.11.noarch.rpm"
RPM_HASH = "83d6b6019bab42e12bccbba2de6f8f8546d4f3cae59a415f0a60b9eca0e80b3ea2600a0902d5a6c3b89855be10943920ef40df074c38ae94eb93959dc7512863"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-system-statistics \
python314-pytest-system-statistics \
python3dist-pytest-system-statistics"

RDEPENDS:${PN} += "python-abi \
python314-attrs \
python314-psutil \
python314-pytest \
python314-pytest-skip-markers \
python314-typing-extensions"

inherit rpm
