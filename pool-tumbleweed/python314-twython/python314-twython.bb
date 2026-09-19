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

RPM_NAME = "python314-twython-3.9.1-3.4.noarch.rpm"
RPM_HASH = "84d7bbc14824237a51f7f01b47cf80c80c2ee1a74e057c81318f1eb1542a3221822a37b682a293323016e7874878b048b744637e451c3b9cd6294bb41daf91a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-twython \
python314-twython \
python3dist-twython"

RDEPENDS:${PN} += "python-abi \
python314-requests \
python314-requests-oauthlib"

inherit rpm
