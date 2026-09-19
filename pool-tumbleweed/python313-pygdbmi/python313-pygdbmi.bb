SUMMARY = "Parse gdb machine interface output with Python"
DESCRIPTION = "Parse gdb machine interface output with Python"
LICENSE = "MIT"

PV = "0.11.0.0"

RPM_NAME = "python313-pygdbmi-0.11.0.0-1.11.noarch.rpm"
RPM_HASH = "4cfef222804cecb4e5dc0e53fe8b5586a0f3a2711c54d9b31e4095a42eb57855ab4e17032e60477e9a56b1bfd634cb267b2d2fda2eea52115c3f1e76b3dad33b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygdbmi \
python3.13dist-pygdbmi \
python313-pygdbmi \
python3dist-pygdbmi"

RDEPENDS:${PN} += "python-abi"

inherit rpm
