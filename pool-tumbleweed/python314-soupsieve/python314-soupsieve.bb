SUMMARY = "A modern CSS selector implementation for BeautifulSoup"
DESCRIPTION = "Soup Sieve is a CSS selector library designed to be used with Beautiful Soup 4. \
It aims to provide selecting, matching, and filtering using modern CSS selectors."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "python314-soupsieve-2.8.4-1.2.noarch.rpm"
RPM_HASH = "f95a5cc52d87ca71f25e19cfc6b6da925c7efe90e9ac107c2bc694ca1ccdaf03a23b1d8ca434e8f95263f8da31aa48cd32ee54929814cbdc38744a41d8172475"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-soupsieve \
python314-soupsieve \
python3dist-soupsieve"

RDEPENDS:${PN} += "python-abi"

inherit rpm
