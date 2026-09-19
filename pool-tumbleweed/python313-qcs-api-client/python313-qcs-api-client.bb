SUMMARY = "Python client library for accessing the Rigetti QCS API"
DESCRIPTION = "Allows access to the Rigetti Quantum Computing System API"
LICENSE = "MIT"

PV = "0.27.3"

RPM_NAME = "python313-qcs-api-client-0.27.3-1.1.noarch.rpm"
RPM_HASH = "888a8457b470f0da029a71839fde44b47792be9d4dda3db579cd68cf6d273cbd96c2838bf461dbd767b57fd02503858cb9c54fb66fe817ba161f7c5f078213a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qcs-api-client \
python3.13dist-qcs-api-client \
python313-qcs-api-client \
python3dist-qcs-api-client"

RDEPENDS:${PN} += "python-abi \
python313-PyJWT \
python313-attrs \
python313-httpx \
python313-pyRFC3339 \
python313-pydantic \
python313-pydantic-settings \
python313-python-dateutil \
python313-qcs-api-client-common \
python313-tenacity \
python313-toml"

inherit rpm
