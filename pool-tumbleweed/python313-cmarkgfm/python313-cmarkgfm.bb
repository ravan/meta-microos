SUMMARY = "Minimal bindings to GitHub's fork of cmark"
DESCRIPTION = "Minimal bindings to GitHub's fork of cmark"
LICENSE = "MIT"

PV = "2025.10.22"

RPM_NAME = "python313-cmarkgfm-2025.10.22-1.4.aarch64.rpm"
RPM_HASH = "5b5f069615e61edba78fa0436a2f9cece73947b3a28ee3a77b2e67f38826778d1b496ae63ac9b4ee6abbd342eed63bf07620bd3e698820eb7145dd863e541690"

RPROVIDES:${PN} += "python3-cmarkgfm \
python3.13dist-cmarkgfm \
python313-cmarkgfm \
python3dist-cmarkgfm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-cffi"

inherit rpm
