SUMMARY = "Math extension for Python-Markdown"
DESCRIPTION = "This extension adds math formulas support to Python-Markdown."
LICENSE = "BSD-3-Clause"

PV = "0.9"

RPM_NAME = "python313-python-markdown-math-0.9-1.5.noarch.rpm"
RPM_HASH = "d45856a9ec1451e10c9e0baa511625bbf31c512447e79073c2b534af761e80f4bb5e4591f24dcf64400fa9ca16f453e756369cb39d1da1096c5485565db1ea0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-markdown-math \
python3-python-markdown-math \
python3.13dist-python-markdown-math \
python313-markdown-math \
python313-python-markdown-math \
python3dist-python-markdown-math"

RDEPENDS:${PN} += "python-abi \
python313-Markdown"

inherit rpm
