SUMMARY = "A Python package installer and resolver, written in Rust"
DESCRIPTION = "uv is a Python package installer and resolver, written in Rust. Designed as a \
drop-in replacement for common pip and pip-tools workflows."
LICENSE = "(Apache-2.0 | MIT) & MPL-2.0"

PV = "0.12.13"

RPM_NAME = "python313-uv-0.12.13-1.1.aarch64.rpm"
RPM_HASH = "26d4f91ca3338e5bf2a5fbe69916e29689c1013146b552a89eef64b8804d3088de44ac5da1636837f981c25905dc05306c2fa97aa00974e7cf4b85754df236a4"

RPROVIDES:${PN} += "python3-uv \
python3.13dist-uv \
python313-uv \
python3dist-uv \
uv"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi \
python3"

inherit rpm
