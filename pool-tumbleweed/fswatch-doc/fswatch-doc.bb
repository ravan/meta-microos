SUMMARY = "Documentation for fswatch"
DESCRIPTION = "Documentation for fswatch a file change monitor."
LICENSE = "GPL-3.0-or-later"

PV = "1.22.0"

RPM_NAME = "fswatch-doc-1.22.0-1.1.noarch.rpm"
RPM_HASH = "64f7fababf6e7d232cf07ca1d64831d3462b54b4a10ae3084236422c7cd0b2e6e53ee8640925fd3a9d5d9182cc313e927d58cc0f73f6e7fe797111b681bb0afa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fswatch-doc"

RDEPENDS:${PN} += "fswatch"

inherit rpm
