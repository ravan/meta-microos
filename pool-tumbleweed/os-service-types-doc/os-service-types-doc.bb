SUMMARY = "Documentation for OpenStack os-service-types library"
DESCRIPTION = "The OpenStack Service Types Authority contains information about official \
OpenStack services and their historical service-type aliases. \
The data is in JSON and the latest data should always be used. This simple \
library exists to allow for easy consumption of the data, along with a built-in \
version of the data to use in case network access is for some reason not \
possible and local caching of the fetched data. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "os-service-types-doc-1.9.0-1.1.noarch.rpm"
RPM_HASH = "e373daec34f7d644df055dda9075f344dcd6309a045613073841ffae0bf1f822cc777d0a29db197980bb68962059a0dc6608cd157a5ab96b3a16ba2861b9a347"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "os-service-types-doc"

RDEPENDS:${PN} += ""

inherit rpm
