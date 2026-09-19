SUMMARY = "TLV(tag length value) data parser"
DESCRIPTION = "TLV (tag length value) data parser, especially useful for EMV tag parsing."
LICENSE = "LGPL-2.0-only"

PV = "0.71"

RPM_NAME = "python313-pytlv-0.71-2.5.noarch.rpm"
RPM_HASH = "2a4a1868548a67246abaef26eb468cca9c80a0f30e48e6a7133ab481a29fb498dd4d62a9f22fc967618d17e351370a1e4954d1d077751c9db83529036b1c07e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytlv \
python3.13dist-pytlv \
python313-pytlv \
python3dist-pytlv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
