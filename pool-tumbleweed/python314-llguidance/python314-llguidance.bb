SUMMARY = "Low-level Guidance (llguidance) bindings for constrained decoding"
DESCRIPTION = "Bindings for the Low-level Guidance (llguidance) Rust library, providing \
super-fast structured outputs and constrained decoding for large language \
models. It supports context-free grammars, JSON schemas and Lark-style \
syntax to constrain token generation."
LICENSE = "Apache-2.0 & MIT & MIT-0 & Unicode-3.0"

PV = "1.8.0"

RPM_NAME = "python314-llguidance-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "49a8c4554f88ffe29ef70ffafe0c7f961f797c698f319805eef41655ce04067a9bb923eb4a99a1de0e5da1ebe8c345ce05040af819c7d0c6a156f2d55947f7e0"

RPROVIDES:${PN} += "python3.14dist-llguidance \
python314-llguidance \
python3dist-llguidance"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
