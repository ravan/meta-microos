SUMMARY = "A library to identify device capabilities (phones, tablets)"
DESCRIPTION = "Python library that can identify/detect devices like mobile phones, \
tablets and their capabilities by parsing (browser/HTTP) user agent \
strings."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python313-user-agents-2.2.0-2.12.noarch.rpm"
RPM_HASH = "5be7e0e096434faf15dfad8f68bbe5413cfa7ccb35fbf1241c01305b102389e4dc768700d976d80b81d6375b65f7d1759115a016c15a9cbe345ff855b3bd7ac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-user-agents \
python3.13dist-user-agents \
python313-user-agents \
python3dist-user-agents"

RDEPENDS:${PN} += "python-abi \
python313-ua-parser"

inherit rpm
