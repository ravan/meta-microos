SUMMARY = "Pytest plugin to track and report system usage statistics"
DESCRIPTION = "Pytest plugin to track and report system usage statistics"
LICENSE = "Apache-2.0"

PV = "1.0.2"

RPM_NAME = "python313-pytest-system-statistics-1.0.2-1.11.noarch.rpm"
RPM_HASH = "98e54bb074f152305bb9db919fd9a7320b0b75b94b27d0b65408a3bd8ac56bf8a293848b6e2a38d92ee8996368b13542e0e5df4c77b2f49b996e0188653f4aa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-system-statistics \
python3.13dist-pytest-system-statistics \
python313-pytest-system-statistics \
python3dist-pytest-system-statistics"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
python313-psutil \
python313-pytest \
python313-pytest-skip-markers \
python313-typing-extensions"

inherit rpm
