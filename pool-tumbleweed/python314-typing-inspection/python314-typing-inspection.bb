SUMMARY = "Runtime typing introspection tools"
DESCRIPTION = "typing-inspection provides tools to inspect type annotations at runtime. \
 \
The library can be imported from the typing_inspection module."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "python314-typing-inspection-0.4.3-1.1.noarch.rpm"
RPM_HASH = "fc46ec7441843fedd0f36ab600ddd8990664b544186dc5ac476a01250d7ec93cb9be085e8109f9546719a4c488511f906c55bb76196d092ba5452f6b4024823e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-typing-inspection \
python314-typing-inspection \
python3dist-typing-inspection"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
