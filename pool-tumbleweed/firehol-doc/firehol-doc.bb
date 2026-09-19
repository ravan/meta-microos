SUMMARY = "FireHOL documentation"
DESCRIPTION = "Contains documentation and configuration examples for FireHOL."
LICENSE = "GPL-2.0-only"

PV = "3.1.8"

RPM_NAME = "firehol-doc-3.1.8-1.4.noarch.rpm"
RPM_HASH = "d6e185e535a87f807e322cc7a4245aee6406af4931d6d87b5a083c39902641284e8580b3171fbf18743eb542c4a5e219b237cd79edf6229c12c51630049eabe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firehol-doc"

RDEPENDS:${PN} += ""

inherit rpm
