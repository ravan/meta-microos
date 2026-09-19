SUMMARY = "Example scripts for squirrel"
DESCRIPTION = "Example scripts to show squirrel usage."
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "squirrel-examples-3.2-4.6.noarch.rpm"
RPM_HASH = "8ba9019adeb32f1d8416451ab739860a430af0b89e975fef37d490b90883524b44b0779fd5a349d62f1687303679026bfe13a8d5cdce09137505d36b8a58e74c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "squirrel-examples"

RDEPENDS:${PN} += ""

inherit rpm
