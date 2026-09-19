SUMMARY = "Generator-based operators for asynchronous iteration"
DESCRIPTION = "aiostream provides a collection of stream operators that can be \
combined to create asynchronous pipelines of operations."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "python313-aiostream-0.7.1-1.4.noarch.rpm"
RPM_HASH = "a3f52ff7491c8916f2ed4515a8c18956e590bd170c3c2d50b20c1ba19e2e2c623ebc4ca7d42674b4d2cb6dfdc182b10287974b83fb22d2d25b4412f0c6184cea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiostream \
python3.13dist-aiostream \
python313-aiostream \
python3dist-aiostream"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
