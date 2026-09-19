SUMMARY = "Runtime typing introspection tools"
DESCRIPTION = "typing-inspection provides tools to inspect type annotations at runtime. \
 \
The library can be imported from the typing_inspection module."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "python313-typing-inspection-0.4.3-1.1.noarch.rpm"
RPM_HASH = "cb3b17e99f2751b5fe3e956b0a005cd7d458ce3cf4941e9abc4cb1ec65f1360b836d5ae3a09b32da3ed000cd720a331c9338f4ed25eae45f2083cca016862ab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-typing-inspection \
python3.13dist-typing-inspection \
python313-typing-inspection \
python3dist-typing-inspection"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
