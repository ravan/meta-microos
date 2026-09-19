SUMMARY = "Adapt generators and other iterables to a file-like interface"
DESCRIPTION = "Adapt generators and other iterables to a file-like interface"
LICENSE = "LGPL-3.0-only"

PV = "1.0.1"

RPM_NAME = "python313-iterable-io-1.0.1-1.3.noarch.rpm"
RPM_HASH = "c16ba19a91f4f242b9fcd0917493e4b5d480dce7795f7c9d6b447a5de213b5f57b554ec3a5ee8bb5f0fadc3df1dd9d66f711f948e3c158f73992e53b31e000f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-iterable-io \
python3.13dist-iterable-io \
python313-iterable-io \
python3dist-iterable-io"

RDEPENDS:${PN} += "python-abi"

inherit rpm
