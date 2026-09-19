SUMMARY = "A modified version of Supybot (an IRC bot and framework)"
DESCRIPTION = "Limnoria is a Python IRC bot with a plugin API. It is equipped with \
an ACL system for specifying user permissions with per-command \
granularity. Numerous plugins are included."
LICENSE = "BSD-3-Clause"

PV = "2026.5.8"

RPM_NAME = "python313-limnoria-2026.5.8-1.2.noarch.rpm"
RPM_HASH = "556476786c6bc6cb8a506478a2ac066fea0a7fce0a432f16ebe7b429f6c2cf5b425dababa1aaeaaedffd79fd7de5d0f12fd4197965ba7f9abc2b11082d78c5bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Supybot \
python3-limnoria \
python3.13dist-limnoria \
python313-limnoria \
python3dist-limnoria"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
procps \
python-abi \
python313 \
python313-PySocks \
python313-chardet \
python313-cryptography \
python313-feedparser \
python313-python-dateutil \
python313-python-gnupg \
python313-tzdata"

inherit rpm
