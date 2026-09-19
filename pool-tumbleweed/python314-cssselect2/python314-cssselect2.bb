SUMMARY = "CSS selectors for Python ElementTree"
DESCRIPTION = "CSSselect2 is an implementation of CSS3 Selectors for markup \
documents (HTML, XML, etc.) that can be read by ElementTree-like \
parsers (including cElementTree, lxml, html5lib, etc.) \
 \
Unlike cssselect, it does not translate selectors to XPath and therefore does \
not have all the correctness corner cases that are hard or impossible to fix in \
cssselect."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "python314-cssselect2-0.9.0-1.4.noarch.rpm"
RPM_HASH = "f6c3a66a10bfbfe0a717344a8f17575d5c33de85a0354bbb850c9a115d6a9e127b5f0e2ced8b7db52b454af7d97e480fcb3612c769e631fd0f1f824c2ab5df56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cssselect2 \
python314-cssselect2 \
python3dist-cssselect2"

RDEPENDS:${PN} += "python-abi \
python314-tinycss2 \
python314-webencodings"

inherit rpm
