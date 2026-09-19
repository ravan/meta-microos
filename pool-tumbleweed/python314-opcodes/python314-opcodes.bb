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

RPM_NAME = "python314-opcodes-0.3.14-4.5.noarch.rpm"
RPM_HASH = "abfc3da2247d8acbcf502729b96b4df6462a97db1d16117146630aadac5e58279bd09bbbd5fa943e6f208fd041cf4b26fdd887b06d73f40e75cef0ee0063a4b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opcodes \
python314-opcodes \
python3dist-opcodes"

RDEPENDS:${PN} += "python-abi"

inherit rpm
