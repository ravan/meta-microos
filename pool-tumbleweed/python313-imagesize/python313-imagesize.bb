SUMMARY = "Getting image size from PNG/JPEG/JPEG2000/GIF files"
DESCRIPTION = "Pure Python library which parses image files' header and returns the image size. \
 \
Supported formats: \
 * PNG \
 * JPEG \
 * JPEG2000 \
 * GIF"
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-imagesize-2.0.0-2.1.noarch.rpm"
RPM_HASH = "ffe18c94e33cc63093c73fb7dfa615a75a46f0344bebff2ce527e3b1a391621d6446b0dc3b8cd4691d09fa58f8667d3323a91b7c20d24d2d45a9b8157181538a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-imagesize \
python3.13dist-imagesize \
python313-imagesize \
python3dist-imagesize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
