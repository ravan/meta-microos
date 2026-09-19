SUMMARY = "Google Cloud API client core library"
DESCRIPTION = "Core Helpers for Google Cloud Python Client Library \
This library is not meant to stand-alone. Instead it defines \
common helpers (e.g. base ``Client`` classes) used by all of the \
``google-cloud-*`` packages."
LICENSE = "Apache-2.0"

PV = "2.7.0"

RPM_NAME = "python313-google-cloud-core-2.7.0-1.1.noarch.rpm"
RPM_HASH = "e3d8a222a903a51b41200bce4ac04fcaf0eca1b593765710fe85b69d436b4cb929e38e22f8eaab6ac228a38d69ea9c0e2ba13b1dd32bd2c7cc258c3a580100a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-core \
python3.13dist-google-cloud-core \
python313-google-cloud-core \
python3dist-google-cloud-core"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth"

inherit rpm
