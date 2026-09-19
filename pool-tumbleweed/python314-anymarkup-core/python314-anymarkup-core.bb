SUMMARY = "Core library for anymarkup"
DESCRIPTION = "This is the core library that implements functionality of \
python-anymarkup."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python314-anymarkup-core-0.8.1-4.5.noarch.rpm"
RPM_HASH = "649188fb5fc73510aecde3538f04c3f66445b40e3a953572915805061319c3c5d9a91321aafe2f40a510b745441fc6bce42c630c0f65e71dece2824af97160ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-anymarkup-core \
python314-anymarkup-core \
python3dist-anymarkup-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
