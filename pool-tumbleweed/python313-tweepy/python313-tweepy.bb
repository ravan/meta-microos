SUMMARY = "Twitter library for python"
DESCRIPTION = "A library for accessing the Twitter.com API. Supports OAuth, covers the entire \
API, and streaming API."
LICENSE = "MIT"

PV = "4.17.0"

RPM_NAME = "python313-tweepy-4.17.0-1.1.noarch.rpm"
RPM_HASH = "fbd4a9e4115321c2e030905a7081293df304363277c911e0151875441a23e71bc90e24c7e86839cfee662879c3d790884e704a9038db2784dedf54db1f4facf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tweepy \
python3.13dist-tweepy \
python313-tweepy \
python3dist-tweepy"

RDEPENDS:${PN} += "-python3.13dist(oauthlib) < 4 with python3.13dist(oauthlib) >= 3.2 \
-python3.13dist(requests) < 3 with python3.13dist(requests) >= 2.27 \
-python3.13dist(requests-oauthlib) < 3 with python3.13dist(requests-oauthlib) >= 1.2 \
python-abi"

inherit rpm
