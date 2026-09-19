SUMMARY = "Compressed Rich Text Format (RTF) compression and decompression package"
DESCRIPTION = "Compressed Rich Text Format (RTF) compression and decompression package"
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "python313-compressed_rtf-1.0.7-2.5.noarch.rpm"
RPM_HASH = "3dfab5473e86ed1fd57b55c7b54ced673c1934a995bf6604438e4d1faa12dfb83f4accdf00ef5f462ab7df06f179475d4e25ca5946a487df5b57fde87326192f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-compressed-rtf \
python3.13dist-compressed-rtf \
python313-compressed-rtf \
python3dist-compressed-rtf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
