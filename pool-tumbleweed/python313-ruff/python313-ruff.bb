SUMMARY = "An extremely fast Python linter, written in Rust"
DESCRIPTION = "Ruff extremely fast Python linter written in rust supperseding many other linting tools"
LICENSE = "MIT & MPL-2.0"

PV = "0.16.7"

RPM_NAME = "python313-ruff-0.16.7-1.1.aarch64.rpm"
RPM_HASH = "2f51f70275515adb11225e2d1c07e1f049e9912cb42a6615a9e34328057b8c0dfd7295ae99e614e9783bea35509d7921b27e23fb52405e6e26a7757dcc563bc0"

RPROVIDES:${PN} += "python3-ruff \
python3.13dist-ruff \
python313-ruff \
python3dist-ruff \
ruff"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
