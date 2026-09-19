SUMMARY = "Convert HTML to markdown"
DESCRIPTION = "Convert HTML to markdown."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "python313-markdownify-1.2.3-1.2.noarch.rpm"
RPM_HASH = "bada46d9c0850fb80df86f68c0a227b3c74358b8e622694f9c149abfcb8c0ffd2182511b22f1564ebc939451121a810fdbd556e96a77bf631693ade54a594b36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-markdownify \
python3.13dist-markdownify \
python313-markdownify \
python3dist-markdownify"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
alts \
python-abi \
python313-beautifulsoup4 \
python313-six"

inherit rpm
