SUMMARY = "Syntactic parser and grammar checker"
DESCRIPTION = "The Link Grammar Parser is a syntactic parser of English, Russian, Arabic \
and Persian (and other languages as well), based on Link Grammar, an \
original theory of syntax and morphology. Given a sentence, the system \
assigns to it a syntactic structure, which consists of a set of labelled \
links connecting pairs of words. \
 \
This package contains Link Grammar's utility, its shared library and \
some data files."
LICENSE = "LGPL-2.1-only"

PV = "5.12.5"

RPM_NAME = "link-grammar-5.12.5-1.6.aarch64.rpm"
RPM_HASH = "5bf623456e09807661144a828f431054a0e174e6d1f61345bdda10c32c96cae033c6d43212c3b15aa0a78bef7a05c50b6d7c57061bc1c33aa369237b217d4483"

RPROVIDES:${PN} += "link-grammar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libedit.so.0 \
liblink-grammar.so.5"

inherit rpm
