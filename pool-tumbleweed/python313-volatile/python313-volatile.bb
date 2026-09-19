SUMMARY = "Python extension for the tempfile module"
DESCRIPTION = "A small Python extension for the tempfile module."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python313-volatile-2.1.0-2.5.noarch.rpm"
RPM_HASH = "463f2c82add8fdb4bb30917ca98c874a6b7c0f5e28106dee9ca7d8f3d3a40a210f9474db1874f5ce7631ce2bf4349a7b6c642a87d691d1c420f68d42b9b77ea4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-volatile \
python3.13dist-volatile \
python313-volatile \
python3dist-volatile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
