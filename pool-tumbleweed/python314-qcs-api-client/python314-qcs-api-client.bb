SUMMARY = "Python client library for accessing the Rigetti QCS API"
DESCRIPTION = "Allows access to the Rigetti Quantum Computing System API"
LICENSE = "MIT"

PV = "0.27.3"

RPM_NAME = "python314-qcs-api-client-0.27.3-1.1.noarch.rpm"
RPM_HASH = "08b3d7916d556b6270b07cee402f9ed1e74e881e2a6e2c4db2a5b44fc9468bb0cac615f46abd623d221351fc0c1e0f1841f7df64462388f4baf2498ebbaf9f32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-qcs-api-client \
python314-qcs-api-client \
python3dist-qcs-api-client"

RDEPENDS:${PN} += "python-abi \
python314-PyJWT \
python314-attrs \
python314-httpx \
python314-pyRFC3339 \
python314-pydantic \
python314-pydantic-settings \
python314-python-dateutil \
python314-qcs-api-client-common \
python314-tenacity \
python314-toml"

inherit rpm
