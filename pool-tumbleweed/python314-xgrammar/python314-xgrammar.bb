SUMMARY = "Efficient, Flexible and Portable Structured Generation"
DESCRIPTION = "XGrammar is an open-source library for efficient, flexible, and portable \
structured generation. It provides a fast engine for constrained decoding \
of large language models against grammars such as JSON schemas, regular \
expressions and context-free grammars."
LICENSE = "Apache-2.0"

PV = "0.2.6"

RPM_NAME = "python314-xgrammar-0.2.6-1.1.aarch64.rpm"
RPM_HASH = "65098dda27b8bb0c45f4647ec79e46300f3c0d15262ec9e7342a2a25a53e0cb78c7904d0a7afe81b6c416ab4b236adc705098f59878e988d093ddfde9f5cea66"

RPROVIDES:${PN} += "libxgrammar-bindings.so \
python3.14dist-xgrammar \
python314-xgrammar \
python3dist-xgrammar"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtvm-ffi.so \
python-abi \
python314-apache-tvm-ffi \
python314-numpy \
python314-pydantic \
python314-torch \
python314-transformers \
python314-typing-extensions"

inherit rpm
