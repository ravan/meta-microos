SUMMARY = "A client library for accessing the Forgejo API"
DESCRIPTION = "A client library for accessing the Forgejo API. \
python314-pyforgejo was generated with the help of openapi-python-client, and doesn't \
try to be compatible with gitea."
LICENSE = "MIT"

PV = "2.0.7"

RPM_NAME = "python314-pyforgejo-2.0.7-1.3.noarch.rpm"
RPM_HASH = "b71b405c8475e50f58917aa0589d5a2287e985859c9a1ca5b58cbd5d4541910ef43cdf5c9bb4b472c5d18816821f370e8b44ecbc5e9d6bbbd29b05a734e60197"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyforgejo \
python314-pyforgejo \
python3dist-pyforgejo"

RDEPENDS:${PN} += "python-abi \
python314-annotated-types \
python314-anyio \
python314-attrs \
python314-certifi \
python314-click \
python314-colorama \
python314-exceptiongroup \
python314-h11 \
python314-httpcore \
python314-httpx \
python314-idna \
python314-iniconfig \
python314-packaging \
python314-pluggy \
python314-pydantic \
python314-pydantic-core \
python314-python-dateutil \
python314-python-dotenv \
python314-sniffio \
python314-tomli \
python314-typing-extensions"

inherit rpm
