SUMMARY = "A Quart extension to provide trio support"
DESCRIPTION = "Quart-Trio is an extension for Quart to support the Trio event loop. This is \
an alternative to using the asyncio event loop present in the Python standard \
library and supported by default in Quart."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python313-quart-trio-0.12.0-1.7.noarch.rpm"
RPM_HASH = "07994c496233dcb6eb9b09953196488f6c2997564c826ec06e06f27db1045fcb5ea363dfde2a33cbae9adab8cccb43dd11ff46c63bddfc12686a3296c396789c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-quart-trio \
python3.13dist-quart-trio \
python313-quart-trio \
python3dist-quart-trio"

RDEPENDS:${PN} += "python-abi \
python313-Quart \
python313-exceptiongroup \
python313-hypercorn \
python313-trio"

inherit rpm
