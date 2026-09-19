SUMMARY = "Structured Text Generation in Rust"
DESCRIPTION = "Core functionality of the Outlines project for structured text generation, \
implemented in Rust. Provides the building blocks used to guide language \
model generation with regular expressions and JSON schemas, including the \
regular-expression to finite-state-machine index, a vocabulary type and a \
guide that constrains token-by-token generation."
LICENSE = "Apache-2.0"

PV = "0.2.14"

RPM_NAME = "python313-outlines_core-0.2.14-1.3.aarch64.rpm"
RPM_HASH = "c56688f5bb824c713c5da030943d64c3e84b8dc592bea8d870cae7f1e177686c58088d14b0490996a7b78767c725cbc09c85b29a5ba03ca285837c2c03e8e844"

RPROVIDES:${PN} += "python3-outlines-core \
python3.13dist-outlines-core \
python313-outlines-core \
python3dist-outlines-core"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
