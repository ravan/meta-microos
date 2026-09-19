SUMMARY = "The common files for the Syncplay client and server"
DESCRIPTION = "The common files for the Syncplay client and server"
LICENSE = "Apache-2.0"

PV = "1.7.6"

RPM_NAME = "syncplay-common-1.7.6-1.1.noarch.rpm"
RPM_HASH = "d11ac4b5c9e87230bdc89e352107c23f0c25d7ae40c30513539b5f3622f8aefcc7e14cabbf5d02a4920b95e7381a1c7969b3e070af9fd9132a4a080c6653f520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "syncplay-common"

RDEPENDS:${PN} += ""

inherit rpm
