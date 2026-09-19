SUMMARY = "Common protobufs used in Google APIs"
DESCRIPTION = "googleapis-common-protos contains the python classes generated from the common \
protos in the googleapis_ repository."
LICENSE = "Apache-2.0"

PV = "1.75.1"

RPM_NAME = "python313-googleapis-common-protos-1.75.1-1.1.noarch.rpm"
RPM_HASH = "45d58553d615a1c7a70e81f4e8dfc51f299f8d6047d33d362f1d5999ec21d74e79e203948e17b64f180f7ca0b6072a47e8ced6307c9132db4e88539e2e4cbc88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-googleapis-common-protos \
python3.13dist-googleapis-common-protos \
python313-googleapis-common-protos \
python3dist-googleapis-common-protos"

RDEPENDS:${PN} += "python-abi \
python313-protobuf"

inherit rpm
