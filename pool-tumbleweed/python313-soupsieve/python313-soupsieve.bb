SUMMARY = "A modern CSS selector implementation for BeautifulSoup"
DESCRIPTION = "Soup Sieve is a CSS selector library designed to be used with Beautiful Soup 4. \
It aims to provide selecting, matching, and filtering using modern CSS selectors."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "python313-soupsieve-2.8.4-1.2.noarch.rpm"
RPM_HASH = "4cf6f1a9b0fd74dc3a9ad85a24a4f0fddb3fe0cb7a345d3ccfd66dbbfc994708f6d138049159be633056c39c10495b76a5465d200c93e0bc1199420149ca9dd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-soupsieve \
python3.13dist-soupsieve \
python313-soupsieve \
python3dist-soupsieve"

RDEPENDS:${PN} += "python-abi"

inherit rpm
