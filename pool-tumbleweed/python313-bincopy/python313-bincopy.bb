SUMMARY = "Mangling of various file formats that conveys binary information"
DESCRIPTION = "Mangling of various file formats that conveys binary information (Motorola S-Record, Intel HEX, TI-TXT, Verilog VMEM, ELF and binary files). \
 \
Project homepage: https://github.com/eerimoq/bincopy \
 \
Documentation: https://bincopy.readthedocs.io"
LICENSE = "MIT"

PV = "20.1.1"

RPM_NAME = "python313-bincopy-20.1.1-1.3.noarch.rpm"
RPM_HASH = "767db1da6718077d37405dcb0c3f2c672393841503bedb7ceaf3e5fe009d7549802f335beff609fae1444f5ed622c2761abe34165822cc2c94a7768259d876e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bincopy \
python3.13dist-bincopy \
python313-bincopy \
python3dist-bincopy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
fdupes \
python-abi \
python313-argparse-addons \
python313-humanfriendly \
python313-pyelftools"

inherit rpm
