SUMMARY = "Twitter library for python"
DESCRIPTION = "A library for accessing the Twitter.com API. Supports OAuth, covers the entire \
API, and streaming API."
LICENSE = "MIT"

PV = "4.17.0"

RPM_NAME = "python314-tweepy-4.17.0-1.1.noarch.rpm"
RPM_HASH = "b8871173e9aba73d51e0c874c8e7c572be592d361a55b76140e4a730d7c84b3f4f6f86313d8e493bb53287045cb5823a5aa20907928e1862ba215f3d260bbd2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tweepy \
python314-tweepy \
python3dist-tweepy"

RDEPENDS:${PN} += "-python3.14dist(oauthlib) < 4 with python3.14dist(oauthlib) >= 3.2 \
-python3.14dist(requests) < 3 with python3.14dist(requests) >= 2.27 \
-python3.14dist(requests-oauthlib) < 3 with python3.14dist(requests-oauthlib) >= 1.2 \
python-abi"

inherit rpm
