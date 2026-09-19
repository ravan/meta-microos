SUMMARY = "The RPC framework and message specification for Rigetti QCS"
DESCRIPTION = "The RPC framework and message specification for Rigetti QCS."
LICENSE = "Apache-2.0"

PV = "3.10.0"

RPM_NAME = "python313-rpcq-3.10.0-1.13.noarch.rpm"
RPM_HASH = "db9049ddb896f70ab8cc721e4b6297b2551242d8df9bb829adacb132a9b08fd9d6a1e95857b1bf2b2e33b6a28752df046487c6dd2608d2407a4b67a20e1d6a1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rpcq \
python3.13dist-rpcq \
python313-rpcq \
python3dist-rpcq"

RDEPENDS:${PN} += "python-abi \
python313-msgpack \
python313-python-rapidjson \
python313-pyzmq \
python313-ruamel.yaml"

inherit rpm
