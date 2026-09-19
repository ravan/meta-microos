SUMMARY = "A small protobuf implementation in C"
DESCRIPTION = "μpb (often written 'upb') is a small protobuf implementation written in C. \
 \
upb generates a C API for creating, parsing, and serializing messages as \
declared in .proto files. upb is heavily arena-based: all messages always live \
in an arena (note: the arena can live in stack or static memory if desired)."
LICENSE = "Apache-2.0"

PV = "1.76.0"

RPM_NAME = "libupb51-1.76.0-3.12.aarch64.rpm"
RPM_HASH = "18f6338b30a760b61925dccf02828bafae0ff53fc066e5fc2f0c9e324be77f230d49fe2b0c1687e51cead6462a4db5680b10c5a8262546f80570829847cde6ce"

RPROVIDES:${PN} += "libupb-base-lib.so.51 \
libupb-hash-lib.so.51 \
libupb-json-lib.so.51 \
libupb-lex-lib.so.51 \
libupb-mem-lib.so.51 \
libupb-message-lib.so.51 \
libupb-mini-descriptor-lib.so.51 \
libupb-mini-table-lib.so.51 \
libupb-reflection-lib.so.51 \
libupb-textformat-lib.so.51 \
libupb-wire-lib.so.51 \
libupb51"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libutf8-range-lib.so.51"

inherit rpm
