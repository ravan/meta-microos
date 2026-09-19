SUMMARY = "Setuptools extension for CalVer package versions"
DESCRIPTION = "Setuptools extension for CalVer package versions"
LICENSE = "Apache-2.0"

PV = "2025.10.20"

RPM_NAME = "python312-calver-2025.10.20-2.6.noarch.rpm"
RPM_HASH = "fc4d0e2eb19a875527776808857a35860519e53fe8d099b04e5fa6e7341cc4447f5f6ab83bd7e89fbd5b0157584537dd16d08112b31057507954267793d06d45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-calver \
python312-calver \
python3dist-calver"

RDEPENDS:${PN} += "python-abi"

inherit rpm
