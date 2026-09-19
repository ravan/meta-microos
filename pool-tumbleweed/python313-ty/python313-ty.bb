SUMMARY = "An extremely fast Python type checker and language server, written in Rust"
DESCRIPTION = "An extremely fast Python type checker and language server, written in Rust."
LICENSE = "MIT"

PV = "0.0.56"

RPM_NAME = "python313-ty-0.0.56-1.3.aarch64.rpm"
RPM_HASH = "ceecd8f3272bf172742cae790507d49cf97c18d965e8d84303299424618af3222e7cbc5e70aa3d9b45373f437849ee84afeee29ac9c84153eb4c53a2fbf1ee88"

RPROVIDES:${PN} += "python3-ty \
python3.13dist-ty \
python313-ty \
python3dist-ty \
ty"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
