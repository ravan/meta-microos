SUMMARY = "The RPC framework and message specification for Rigetti QCS"
DESCRIPTION = "The RPC framework and message specification for Rigetti QCS."
LICENSE = "Apache-2.0"

PV = "3.10.0"

RPM_NAME = "python314-rpcq-3.10.0-1.13.noarch.rpm"
RPM_HASH = "b6bdfeed05ad7efc14528ab2cf274fd5d8fefc8bd62ca7915dc8b84b62eca10ddaa44d791f0fa21dacffb5dbce4c3bab0404979dea4220fb63d0af5bac95da9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rpcq \
python314-rpcq \
python3dist-rpcq"

RDEPENDS:${PN} += "python-abi \
python314-msgpack \
python314-python-rapidjson \
python314-pyzmq \
python314-ruamel.yaml"

inherit rpm
