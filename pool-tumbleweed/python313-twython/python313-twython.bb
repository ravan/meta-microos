SUMMARY = "Python wrapper for the Twitter API"
DESCRIPTION = "Twython is a Python library providing a way to access Twitter data. \
 \
Features include: \
 \
- Query data for: \
    - User information \
    - Twitter lists \
    - Timelines \
    - Direct Messages \
    - and anything found in `the docs <https://dev.twitter.com/docs/api/1.1>`_ \
- Image Uploading: \
    - Update user status with an image \
    - Change user avatar \
    - Change user background image \
    - Change user banner image \
- OAuth 2 Application Only (read-only) Support \
- Support for Twitter's Streaming API \
- Seamless Python 3 support!"
LICENSE = "MIT"

PV = "3.9.1"

RPM_NAME = "python313-twython-3.9.1-3.4.noarch.rpm"
RPM_HASH = "660c5ea04900c52787710f8fe25b05e971039f39e2f543171c98311818b5538eaa93aa3860e2a366d8c262a3f887d7c3130b82d743970286d83f5cf09682c054"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-twython \
python3.13dist-twython \
python313-twython \
python3dist-twython"

RDEPENDS:${PN} += "python-abi \
python313-requests \
python313-requests-oauthlib"

inherit rpm
