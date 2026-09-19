SUMMARY = "pytest plugin for grpc"
DESCRIPTION = "pytest plugin for grpc"
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python313-pytest-grpc-0.8.0-2.9.noarch.rpm"
RPM_HASH = "aeefff65979727e33017ebb3e3bc56f0af0dcc9e2e67765bcd265a12731cd908046c480a757e4f7b232ec662b20aca230238f27899f190ce4dead99cdb7fa6cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-grpc \
python3.13dist-pytest-grpc \
python313-pytest-grpc \
python3dist-pytest-grpc"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
