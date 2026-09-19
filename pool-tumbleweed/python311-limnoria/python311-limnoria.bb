SUMMARY = "A modified version of Supybot (an IRC bot and framework)"
DESCRIPTION = "Limnoria is a Python IRC bot with a plugin API. It is equipped with \
an ACL system for specifying user permissions with per-command \
granularity. Numerous plugins are included."
LICENSE = "BSD-3-Clause"

PV = "2026.5.8"

RPM_NAME = "python311-limnoria-2026.5.8-1.1.noarch.rpm"
RPM_HASH = "f15565f1eedb216669cf935c379cf897d46cab9f2ddeb14c2fa58d145560a2f248f4263026b28014138a57d3fa6c160089fa113653125c53a1dcaf0a367247fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Supybot \
python3.11dist-limnoria \
python311-limnoria \
python3dist-limnoria"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
procps \
python-abi \
python311 \
python311-PySocks \
python311-chardet \
python311-cryptography \
python311-feedparser \
python311-python-dateutil \
python311-python-gnupg \
python311-tzdata"

inherit rpm
