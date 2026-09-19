SUMMARY = "Cython implementation of PyParsing"
DESCRIPTION = "Cython implementation of PyParsing created for use in Coconut and Undebt."
LICENSE = "Apache-2.0"

PV = "2.4.7.2.4.3"

RPM_NAME = "python313-cPyparsing-2.4.7.2.4.3-1.6.aarch64.rpm"
RPM_HASH = "00e3f6a0379d5426c972de8324678e16db5c7b5e82e37d54d0f88f43d843601d23542afd67091bb9b92aff5a5f4d77bbdcaa4d2d9dcd53c8efdffcbb647c6449"

RPROVIDES:${PN} += "python3-cPyparsing \
python3.13dist-cpyparsing \
python313-cPyparsing \
python3dist-cpyparsing"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
