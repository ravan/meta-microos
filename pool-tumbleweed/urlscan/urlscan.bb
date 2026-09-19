SUMMARY = "An other URL extractor/viewer"
DESCRIPTION = "The urlscan utility displays URLs found in an email message with \
the respective context. Selecting an URL uses the Python webbrowser \
module to determine which browser to open. It also supports \
quoted-printable and base64 encoding."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.2"

RPM_NAME = "urlscan-1.1.2-1.1.noarch.rpm"
RPM_HASH = "cf569d7b78008d08d82f967bc69c8977a5c3ad176299557712f05655519110043d853690ed3c0f199c50819a0a2bc7f1c0c19b890940b76d8e18c3692f2dd84d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-urlscan \
python3dist-urlscan \
urlscan"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-base \
python3-urwid"

inherit rpm
