SUMMARY = "Python EDBG protocol library"
DESCRIPTION = "Low-level protocol library for communicating with Microchip CMSIS-DAP based debuggers."
LICENSE = "MIT"

PV = "2.24.2.18"

RPM_NAME = "python313-pyedbglib-2.24.2.18-1.3.noarch.rpm"
RPM_HASH = "7a35ded3958249fb6576124d6cf57cb769a056c35545fdee5d21de604a6c62269a81fa4ca14c0ee0382ec09c1e258f3c45a5e0bcc6d1669a2b11a28595d4103b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyedbglib \
python3-pyedbglib \
python3.13dist-pyedbglib \
python313-pyedbglib \
python3dist-pyedbglib"

RDEPENDS:${PN} += "python-abi \
python313-Cython \
python313-base \
python313-hidapi \
python313-pyserial"

inherit rpm
