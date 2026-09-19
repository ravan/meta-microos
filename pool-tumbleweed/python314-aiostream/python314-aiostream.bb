SUMMARY = "Generator-based operators for asynchronous iteration"
DESCRIPTION = "aiostream provides a collection of stream operators that can be \
combined to create asynchronous pipelines of operations."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "python314-aiostream-0.7.1-1.4.noarch.rpm"
RPM_HASH = "cc6519a77428b7b36772a2dc3a1ebe4e1de95db362d425f045a982c2cf2961cd293f87d2c2a3cf0c59c90ed9bd8791c5d8802c7a62a62e10a80a7f890d7859d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aiostream \
python314-aiostream \
python3dist-aiostream"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
