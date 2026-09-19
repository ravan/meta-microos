SUMMARY = "Python library for consuming OpenStack sevice-types-authority data"
DESCRIPTION = "The OpenStack Service Types Authority contains information about official \
OpenStack services and their historical service-type aliases. \
The data is in JSON and the latest data should always be used. This simple \
library exists to allow for easy consumption of the data, along with a built-in \
version of the data to use in case network access is for some reason not \
possible and local caching of the fetched data."
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "python313-os-service-types-1.9.0-1.1.noarch.rpm"
RPM_HASH = "74e9787d26dec6bffb5144ca27fa0bc35701568c2ad8c5b6c0d6b34004f1b54b52ce6e490f47d5f7e064000568d4b07a516e098b6775ee78fa9f6f25b86cf3e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-os-service-types \
python3.13dist-os-service-types \
python313-os-service-types \
python3dist-os-service-types"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
