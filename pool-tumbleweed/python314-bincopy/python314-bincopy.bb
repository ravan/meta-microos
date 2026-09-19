SUMMARY = "Mangling of various file formats that conveys binary information"
DESCRIPTION = "Mangling of various file formats that conveys binary information (Motorola S-Record, Intel HEX, TI-TXT, Verilog VMEM, ELF and binary files). \
 \
Project homepage: https://github.com/eerimoq/bincopy \
 \
Documentation: https://bincopy.readthedocs.io"
LICENSE = "MIT"

PV = "20.1.1"

RPM_NAME = "python314-bincopy-20.1.1-1.3.noarch.rpm"
RPM_HASH = "1e153d0f8647d78aebf18670bfdccc8611ff3a262b84c7f6c26eb23f058257ced761e752914dc2ee6e176ce938e7ce8ac98bdd3bea7e0c57278a28396e902a36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-bincopy \
python314-bincopy \
python3dist-bincopy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
fdupes \
python-abi \
python314-argparse-addons \
python314-humanfriendly \
python314-pyelftools"

inherit rpm
