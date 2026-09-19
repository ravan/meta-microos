SUMMARY = "Database of Processor Instructions/Opcodes"
DESCRIPTION = "The goal of this project is to document instruction sets in a format convenient \
for tools development. An instruction set is represented by three files: \
 \
- An XML file that describes instructions \
- An XSD file that describes the structure of the XML file \
- A Python module that reads the XML file and represents it as a set of Python \
  objects \
 \
This project is a spin-off from <https://github.com/Maratyszcza/PeachPy"
LICENSE = "BSD-2-Clause"

PV = "0.3.14"

RPM_NAME = "python313-opcodes-0.3.14-4.5.noarch.rpm"
RPM_HASH = "b6681b7348950c47e7e13869e6e209f3bcafef355dbb3947ab20b76bed0a7d5748765348982e2d69da2dcfe817f0771f64fc268ab823776d5945d14c43e8d6ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opcodes \
python3.13dist-opcodes \
python313-opcodes \
python3dist-opcodes"

RDEPENDS:${PN} += "python-abi"

inherit rpm
