SUMMARY = "An extremely fast Python type checker and language server, written in Rust"
DESCRIPTION = "An extremely fast Python type checker and language server, written in Rust."
LICENSE = "MIT"

PV = "0.0.56"

RPM_NAME = "python314-ty-0.0.56-1.3.aarch64.rpm"
RPM_HASH = "20ff415d04e19c7c22e6a7c6e37b2485d42d9136529ae06aef1e488161401188a0bea0a34870bb4f316260a41ac59d4123f700b9e53da1d1f95f939483eb16e9"

RPROVIDES:${PN} += "python3.14dist-ty \
python314-ty \
python3dist-ty \
ty"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
