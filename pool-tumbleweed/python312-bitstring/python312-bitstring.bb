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

PV = "4.3.1"

RPM_NAME = "python312-bitstring-4.3.1-1.1.noarch.rpm"
RPM_HASH = "143dd3e463ee3f9906e54d43f46abb6d10142736974e34a946036a3966a8c5f5f743dd51a8e1a69b28985a07e5ed167e6be057fdcdc31f229d89d186c89169fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-bitstring \
python312-bitstring \
python3dist-bitstring"

RDEPENDS:${PN} += "python-abi \
python312-bitarray"

inherit rpm
