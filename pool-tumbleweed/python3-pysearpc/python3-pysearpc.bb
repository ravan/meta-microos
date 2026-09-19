SUMMARY = "Python files for libsearpc"
DESCRIPTION = "The python-pysearpc package contains python files to make use of libsearpc."
LICENSE = "Apache-2.0"

PV = "3.3.0.20250303"

RPM_NAME = "python3-pysearpc-3.3.0.20250303-1.6.aarch64.rpm"
RPM_HASH = "24f82bb38154b3575090555d7f125bd305e654ad3d3ef3daeea83f2be3ecbe5e40acb04d18fc2555c85b1d2dbb6ad1bec39d681f5e9f9176057236ea5d006ff8"

RPROVIDES:${PN} += "python3-pysearpc"

RDEPENDS:${PN} += "libsearpc1 \
python-abi"

inherit rpm
