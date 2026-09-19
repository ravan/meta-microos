SUMMARY = "Google Cloud API client core library"
DESCRIPTION = "Core Helpers for Google Cloud Python Client Library \
This library is not meant to stand-alone. Instead it defines \
common helpers (e.g. base ``Client`` classes) used by all of the \
``google-cloud-*`` packages."
LICENSE = "Apache-2.0"

PV = "2.7.0"

RPM_NAME = "python314-google-cloud-core-2.7.0-1.1.noarch.rpm"
RPM_HASH = "5569ef7524d672729fa8f65b7edaf9067a2042f48d433d21b1defc8615028d53e04110950cfcc4c055a349548f34d15cbdc32acf243d5eedaae959244981cb0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-core \
python314-google-cloud-core \
python3dist-google-cloud-core"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth"

inherit rpm
