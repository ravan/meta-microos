SUMMARY = "A client library for accessing the Forgejo API"
DESCRIPTION = "A client library for accessing the Forgejo API. \
python313-pyforgejo was generated with the help of openapi-python-client, and doesn't \
try to be compatible with gitea."
LICENSE = "MIT"

PV = "2.0.7"

RPM_NAME = "python313-pyforgejo-2.0.7-1.3.noarch.rpm"
RPM_HASH = "eaad130c1d26de57993985867c93f5449120e10b87ad35b22caaf2c12e8567d8a4e51922990b57188492f1570bb69338b258acbebbb3f52b8c324f19206a6406"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyforgejo \
python3.13dist-pyforgejo \
python313-pyforgejo \
python3dist-pyforgejo"

RDEPENDS:${PN} += "python-abi \
python313-annotated-types \
python313-anyio \
python313-attrs \
python313-certifi \
python313-click \
python313-colorama \
python313-exceptiongroup \
python313-h11 \
python313-httpcore \
python313-httpx \
python313-idna \
python313-iniconfig \
python313-packaging \
python313-pluggy \
python313-pydantic \
python313-pydantic-core \
python313-python-dateutil \
python313-python-dotenv \
python313-sniffio \
python313-tomli \
python313-typing-extensions"

inherit rpm
