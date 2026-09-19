SUMMARY = "Google authentication library"
DESCRIPTION = "This library provides oauthlib integration with google-auth."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "python314-google-auth-oauthlib-1.4.1-1.1.noarch.rpm"
RPM_HASH = "b693372fde6e32832fa35cb4927f14673bd141805ac6b1324764d014e3a3c3f7d42baf1ee313b5c36c8b5e7422d409e3735af0377bf38262060571c263f074d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-auth-oauthlib \
python314-google-auth-oauthlib \
python3dist-google-auth-oauthlib"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-google-auth \
python314-requests-oauthlib \
update-alternatives"

inherit rpm
