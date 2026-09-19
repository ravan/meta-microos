SUMMARY = "Python YAML parser c-library"
DESCRIPTION = "ruamel.yaml.clib is a YAML parser/emitter that supports roundtrip preservation \
of comments, seq/map flow style, and map key order. \
This package contains the C library counterpart of it."
LICENSE = "MIT"

PV = "0.2.15"

RPM_NAME = "python314-ruamel.yaml.clib-0.2.15-1.4.aarch64.rpm"
RPM_HASH = "0d226b947a472a281e2e695ee5307c7f92c5db41f2e6fa3da77fff6edbf60d3c0f76445cc9c57cdb3ee2d1030d670461160c9791a15658a6dfd07ea42027c260"

RPROVIDES:${PN} += "python3.14dist-ruamel.yaml.clib \
python314-ruamel.yaml.clib \
python3dist-ruamel.yaml.clib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
