SUMMARY = "A utility for sending push notifications"
DESCRIPTION = "ntfy brings notification to your shell. It can automatically provide \
desktop notifications when long running commands finish or it can send \
push notifications to your phone when a specific command finishes. \
 \
Quickstart \
---------- \
 \
    $ ntfy send test \
     \
     \
    $ ntfy done sleep 10"
LICENSE = "GPL-3.0-only"

PV = "2.7.1"

RPM_NAME = "python313-ntfy-2.7.1-2.4.noarch.rpm"
RPM_HASH = "76f603813f66dbd3c463d74cc668f89248e7ecb973455ff4a0194499df144f9e3c4484f02f66ccd680d8e36ffb8f9fb6ac60b67d72b10cc86d1a8c1e7e991f28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ntfy \
python3.13dist-ntfy \
python313-ntfy \
python3dist-ntfy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-appdirs \
python313-requests \
python313-ruamel.yaml"

inherit rpm
