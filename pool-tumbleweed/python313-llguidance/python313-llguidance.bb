SUMMARY = "Low-level Guidance (llguidance) bindings for constrained decoding"
DESCRIPTION = "Bindings for the Low-level Guidance (llguidance) Rust library, providing \
super-fast structured outputs and constrained decoding for large language \
models. It supports context-free grammars, JSON schemas and Lark-style \
syntax to constrain token generation."
LICENSE = "Apache-2.0 & MIT & MIT-0 & Unicode-3.0"

PV = "1.8.0"

RPM_NAME = "python313-llguidance-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "9a37e86c547897304e83a7851c1a98828a80e33e18be516700cd1dd0c5e8e57b6d2d7a611b1dadfc53643c3f80738cd12e9db7a5af1c1252e839b19a1c02fa58"

RPROVIDES:${PN} += "python3-llguidance \
python3.13dist-llguidance \
python313-llguidance \
python3dist-llguidance"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
