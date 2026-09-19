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

RPM_NAME = "python313-pyahocorasick-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "503ba3ba7743c0a0db2d99e4a9ff51d932b1df6c31e286c47e1f379475a2adf3c2b67f7574e849236db1292005d9051aaf6f1f2e33f2c1e0516ab83889cdc332"

RPROVIDES:${PN} += "python3-pyahocorasick \
python3.13dist-pyahocorasick \
python313-pyahocorasick \
python3dist-pyahocorasick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
