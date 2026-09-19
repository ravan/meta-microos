SUMMARY = "Library for exact or approximate multi-pattern string search"
DESCRIPTION = "pyahocorasick is a library for exact or approximate \
multi-pattern string search, meaning that one can find \
multiple key strings occurrences at once in some input text.  The \
library provides an `ahocorasick` Python module that you can use as \
a plain dict-like Trie or convert a Trie to an automaton for efficient \
Aho-Corasick search. \
 \
It is implemented in C."
LICENSE = "BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "python314-pyahocorasick-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "cde741dd84d2f5edce0e6f831e0f9de21b765cacbf6be0d0252fd7ffc4867e9da72d8d37d140e76d7e593202e6b1a0c4cd4fcf8f22704b3652fc4a45f4b024e6"

RPROVIDES:${PN} += "python3.14dist-pyahocorasick \
python314-pyahocorasick \
python3dist-pyahocorasick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
