SUMMARY = "Python YAML parser c-library"
DESCRIPTION = "ruamel.yaml.clib is a YAML parser/emitter that supports roundtrip preservation \
of comments, seq/map flow style, and map key order. \
This package contains the C library counterpart of it."
LICENSE = "MIT"

PV = "0.2.15"

RPM_NAME = "python313-ruamel.yaml.clib-0.2.15-1.4.aarch64.rpm"
RPM_HASH = "2a201ab2e55d214ee7733d0141b0d5535b35b725b94933bab302b5c62df24c83d01fc320389d12b7d815743ba6b091299f0bf715be13df5fb911aed0485db0de"

RPROVIDES:${PN} += "python3-ruamel.yaml.clib \
python3.13dist-ruamel.yaml.clib \
python313-ruamel.yaml.clib \
python3dist-ruamel.yaml.clib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
