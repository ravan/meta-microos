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

RPM_NAME = "python313-cssselect2-0.9.0-1.4.noarch.rpm"
RPM_HASH = "ce2e2e893b917b6ef916b8503093ded93bd0d814c1163bb7696ab8a2ad193707111e97be971be56046ea1cdb47a1fdef41f12c47d42f01b51bc70cb8e85fe22b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cssselect2 \
python3.13dist-cssselect2 \
python313-cssselect2 \
python3dist-cssselect2"

RDEPENDS:${PN} += "python-abi \
python313-tinycss2 \
python313-webencodings"

inherit rpm
