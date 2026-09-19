SUMMARY = "Efficient, Flexible and Portable Structured Generation"
DESCRIPTION = "XGrammar is an open-source library for efficient, flexible, and portable \
structured generation. It provides a fast engine for constrained decoding \
of large language models against grammars such as JSON schemas, regular \
expressions and context-free grammars."
LICENSE = "Apache-2.0"

PV = "0.2.6"

RPM_NAME = "python313-xgrammar-0.2.6-1.1.aarch64.rpm"
RPM_HASH = "a9b9e7c32a1d9e8d6840684b3b3246f3df64e9d7dc9b8f249a1a94131a1ce12c174d2a099caac76599c632bb9db9a456ed35fca2febf38391710187306162e4c"

RPROVIDES:${PN} += "libxgrammar-bindings.so \
python3-xgrammar \
python3.13dist-xgrammar \
python313-xgrammar \
python3dist-xgrammar"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtvm-ffi.so \
python-abi \
python313-apache-tvm-ffi \
python313-numpy \
python313-pydantic \
python313-torch \
python313-transformers \
python313-typing-extensions"

inherit rpm
