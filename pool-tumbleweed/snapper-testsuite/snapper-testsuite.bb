SUMMARY = "Integration tests for snapper"
DESCRIPTION = "Tests to be run in a scratch machine to test that snapper operates as expected."
LICENSE = "GPL-2.0-only"

PV = "0.13.1"

RPM_NAME = "snapper-testsuite-0.13.1-3.3.aarch64.rpm"
RPM_HASH = "086421f32a763bb7afa2308bd4d5e9d96a7d5e8448d9e3e4a2335b9c721f7bf844faa365d7f1c12af4e9c30f934642f833d708fb57d90de26845489a29ef9c63"

RPROVIDES:${PN} += "snapper-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsnapper.so.8 \
libstdc++.so.6"

inherit rpm
