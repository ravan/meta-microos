SUMMARY = "A modified version of Supybot (an IRC bot and framework)"
DESCRIPTION = "Limnoria is a Python IRC bot with a plugin API. It is equipped with \
an ACL system for specifying user permissions with per-command \
granularity. Numerous plugins are included."
LICENSE = "BSD-3-Clause"

PV = "2026.5.8"

RPM_NAME = "python314-limnoria-2026.5.8-1.2.noarch.rpm"
RPM_HASH = "5c6c6096caf2629063027592d8e22c4af3cccfba379baa59c7e2dae12b8c9436b0c39953fa769b567a82dd417d1f2e0562f420bb37f4b505739c423ea1ea953b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Supybot \
python3.14dist-limnoria \
python314-limnoria \
python3dist-limnoria"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
procps \
python-abi \
python314 \
python314-PySocks \
python314-chardet \
python314-cryptography \
python314-feedparser \
python314-python-dateutil \
python314-python-gnupg \
python314-tzdata"

inherit rpm
