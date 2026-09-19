SUMMARY = "Structured Text Generation in Rust"
DESCRIPTION = "Core functionality of the Outlines project for structured text generation, \
implemented in Rust. Provides the building blocks used to guide language \
model generation with regular expressions and JSON schemas, including the \
regular-expression to finite-state-machine index, a vocabulary type and a \
guide that constrains token-by-token generation."
LICENSE = "Apache-2.0"

PV = "0.2.14"

RPM_NAME = "python314-outlines_core-0.2.14-1.3.aarch64.rpm"
RPM_HASH = "7976913f41003bbf9cc5d6703d7a59544fa3cd52a6affa66c9df129fcb0908055e93f8c508901ae24da6ccadf6e4c745d1de9f74ac37231845a7f5b2f4323881"

RPROVIDES:${PN} += "python3.14dist-outlines-core \
python314-outlines-core \
python3dist-outlines-core"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
