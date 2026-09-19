SUMMARY = "Finite-state compiler and C library"
DESCRIPTION = "Foma is a compiler, programming language, and C library for constructing \
finite-state automata and transducers for various uses. It has specific support \
for many natural language processing applications such as producing \
morphological analyzers. Although NLP applications are probably the main use of \
foma, it is sufficiently generic to use for a large number of purposes."
LICENSE = "Apache-2.0"

PV = "0.10.0+git22"

RPM_NAME = "foma-0.10.0+git22-1.9.aarch64.rpm"
RPM_HASH = "14d6a3f586be5c42ff6a275b4677c36bb0329477d64c68501cd846f78758f4148ff8eb6aa6eadfbb017ed815b67095d0d37bc1b4b918908c63139c599477d847"

RPROVIDES:${PN} += "foma"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libz.so.1"

inherit rpm
