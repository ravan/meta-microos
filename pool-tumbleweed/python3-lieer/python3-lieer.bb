SUMMARY = "Email-fetching, sending, and two-way tag sync between notmuch and GMail"
DESCRIPTION = "This program can pull, and send, email and labels (and changes to labels) from \
a GMail account and store them locally in a maildir with the labels \
synchronized with a notmuch database. The changes to tags in the notmuch \
database may be pushed back remotely to your GMail account."
LICENSE = "GPL-3.0-or-later"

PV = "1.6+21"

RPM_NAME = "python3-lieer-1.6+21-1.5.noarch.rpm"
RPM_HASH = "4b26edf8bbc4e010860bf46bcedb5356d57a98dcb8174791946395d31a8dc8a5e38743585cfef6ee092b2fe8e400c06a823352041effa2e2277187219cf3175c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lieer \
python3.13dist-lieer \
python3dist-lieer"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
notmuch \
python-abi \
python3-google-api-python-client \
python3-google-auth-oauthlib \
python3-tqdm"

inherit rpm
