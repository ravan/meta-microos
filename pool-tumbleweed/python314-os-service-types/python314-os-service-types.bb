SUMMARY = "Python library for consuming OpenStack sevice-types-authority data"
DESCRIPTION = "The OpenStack Service Types Authority contains information about official \
OpenStack services and their historical service-type aliases. \
The data is in JSON and the latest data should always be used. This simple \
library exists to allow for easy consumption of the data, along with a built-in \
version of the data to use in case network access is for some reason not \
possible and local caching of the fetched data."
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "python314-os-service-types-1.9.0-1.1.noarch.rpm"
RPM_HASH = "e55a43801acc220fea85857c5e913728e4431f8d2fc12e262ce0c8925b606473ba9b59e80070305b4cb759c1f8d40ed990fbe672e35449829ce60baa46b0297b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-os-service-types \
python314-os-service-types \
python3dist-os-service-types"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
