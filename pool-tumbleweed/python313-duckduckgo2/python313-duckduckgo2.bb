SUMMARY = "Library for querying the DuckDuckGo API"
DESCRIPTION = "A Python library for querying the DuckDuckGo API."
LICENSE = "BSD-3-Clause"

PV = "0.242"

RPM_NAME = "python313-duckduckgo2-0.242-4.10.noarch.rpm"
RPM_HASH = "cdbe245aaab0a44568c74e3966e28950492440aa1717be7317916fdac621fc12a84d086de504cd71b663eaa05df572e55ba424b8b809145decec2e7f03064c3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-duckduckgo2 \
python3.13dist-duckduckgo2 \
python313-duckduckgo2 \
python3dist-duckduckgo2"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
