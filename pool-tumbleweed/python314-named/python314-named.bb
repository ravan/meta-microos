SUMMARY = "Named types"
DESCRIPTION = "Named types. \
 \
This library defines the Named protocol for types that contain the __name__ \
attribute, abstracting the attribute itself away."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python314-named-1.4.2-2.8.noarch.rpm"
RPM_HASH = "10ecde1d0cf7e652f0d8b4d4ebf2c7a4f5787ea7d6a87c5730119237daa5c4976a2f8264b88372cbd43d9d51fd4a9ae9ffc9aa642f71ab1526b0e3a8624dd965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-named \
python314-named \
python3dist-named"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
