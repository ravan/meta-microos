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

RPM_NAME = "python313-bitstring-4.4.0-1.3.noarch.rpm"
RPM_HASH = "752ef0f20f41551a6a2ded4771008193ba9077105a8624cd7e88b4653b293f48313a1d95988ed14530cdcc9561e4672c14f6d1cb0a3fac0bdbcdfb56e4ef2af6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bitstring \
python3.13dist-bitstring \
python313-bitstring \
python3dist-bitstring"

RDEPENDS:${PN} += "python-abi \
python313-bitarray"

inherit rpm
