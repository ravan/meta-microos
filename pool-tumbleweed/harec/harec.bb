SUMMARY = "Bootstrap compiler for hare"
DESCRIPTION = "HareC is a bootstrap compiler for the Hare programming language. Written in C11 for \
POSIX-compatible systems."
LICENSE = "GPL-3.0-only"

PV = "0.26.0"

RPM_NAME = "harec-0.26.0-2.1.aarch64.rpm"
RPM_HASH = "24f572e50e77a402c012990af8ef8d877f7432cd7ebcfa9a0c8a4da39ca07a5708fc2c377538fd66da7fef70d19656bd3d1d4d0d267f03060909f158d2c08f5c"

RPROVIDES:${PN} += "harec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
