SUMMARY = "Python module for the construction, analysis and modification of binary data"
DESCRIPTION = "Bitstring is a pure Python module to aid \
the creation and analysis of binary data. \
 \
Bitstrings can be constructed from integers (big and little endian), hex, \
octal, binary, strings or files. They can be sliced, joined, reversed, \
inserted into, overwritten, etc. with functions or slice notation. \
They can also be read from, searched and replaced, and navigated in, \
similar to a file or stream."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python314-bitstring-4.4.0-1.3.noarch.rpm"
RPM_HASH = "6b2eca2f0948509b0e8830a0badad2ef8b1bf291fbaa670b6eb43ce1e97a9737270364b5206b58ec04bf559b9078393ee024b7b7edada57b16c324430b66e0bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-bitstring \
python314-bitstring \
python3dist-bitstring"

RDEPENDS:${PN} += "python-abi \
python314-bitarray"

inherit rpm
