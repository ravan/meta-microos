SUMMARY = "A drop in replacement for xpyb, an XCB python binding"
DESCRIPTION = "The xcffib package is intended to be a (mostly) drop-in \
replacement for xpyb."
LICENSE = "Apache-2.0"

PV = "1.12.0"

RPM_NAME = "python313-xcffib-1.12.0-1.3.noarch.rpm"
RPM_HASH = "5225b9abd3d07dd7bc4a528ee68792a6554504b33fe0465c5f42ce7cde1a4eb37652372bb150bf3f80c9975ed83f9c94701b2d9e979bfa6dfd4c9bcfed6c2a70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xcffib \
python3.13dist-xcffib \
python313-xcffib \
python3dist-xcffib"

RDEPENDS:${PN} += "python-abi \
python313-cffi"

inherit rpm
