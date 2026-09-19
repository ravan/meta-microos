SUMMARY = "TLV(tag length value) data parser"
DESCRIPTION = "TLV (tag length value) data parser, especially useful for EMV tag parsing."
LICENSE = "LGPL-2.0-only"

PV = "0.71"

RPM_NAME = "python314-pytlv-0.71-2.5.noarch.rpm"
RPM_HASH = "f7df3794af6917daa11e9e22175ae6ca078d6595e8a09348fb6722ee35a81330017946049e8191c8e3403e5817026fdc06c1fea2f122f78442345dac9216401c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytlv \
python314-pytlv \
python3dist-pytlv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
