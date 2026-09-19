SUMMARY = "An extremely fast Python linter, written in Rust"
DESCRIPTION = "Ruff extremely fast Python linter written in rust supperseding many other linting tools"
LICENSE = "MIT & MPL-2.0"

PV = "0.16.7"

RPM_NAME = "python314-ruff-0.16.7-1.1.aarch64.rpm"
RPM_HASH = "01b66a6941cfdca72e2cd2224b70a3923491ab8973e006ebe430320a14d63ba53c60c802ec7002d615907a283c08290b14ee3b615b604eca4d0b8cc3440cb701"

RPROVIDES:${PN} += "python3.14dist-ruff \
python314-ruff \
python3dist-ruff \
ruff"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
