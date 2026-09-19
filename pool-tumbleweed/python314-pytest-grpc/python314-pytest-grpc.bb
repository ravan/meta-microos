SUMMARY = "pytest plugin for grpc"
DESCRIPTION = "pytest plugin for grpc"
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python314-pytest-grpc-0.8.0-2.9.noarch.rpm"
RPM_HASH = "7cca6d21f5cea929feeb5d6550fbc7f7dba14fcfc9661e7d942ed806ff1e323728427ea2fe689952c09624bad125e49ac2ca14ee6b6f648e2fd3362b6310a353"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-grpc \
python314-pytest-grpc \
python3dist-pytest-grpc"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
