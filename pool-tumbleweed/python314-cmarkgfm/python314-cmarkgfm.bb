SUMMARY = "Minimal bindings to GitHub's fork of cmark"
DESCRIPTION = "Minimal bindings to GitHub's fork of cmark"
LICENSE = "MIT"

PV = "2025.10.22"

RPM_NAME = "python314-cmarkgfm-2025.10.22-1.4.aarch64.rpm"
RPM_HASH = "7e3f60fdc4ca3e3140a1d17f4b17e84cebd2dfe995a482689ac8d90c2501a67441d7badb7a286d61c4adcab2efa03b64d1366499a48802ba6490d6326c142b6a"

RPROVIDES:${PN} += "python3.14dist-cmarkgfm \
python314-cmarkgfm \
python3dist-cmarkgfm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-cffi"

inherit rpm
