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

RPM_NAME = "python311-bitstring-4.3.1-1.1.noarch.rpm"
RPM_HASH = "18187d5b2865e0f78b4a7ede6edceea56e82c593a63484f60f73ea7cbb89cc6141a0296252a87e6846e51d66a3eb905be9cc800b0b337d927e2d541e7e8e08ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-bitstring \
python311-bitstring \
python3dist-bitstring"

RDEPENDS:${PN} += "python-abi \
python311-bitarray"

inherit rpm
