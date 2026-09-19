SUMMARY = "Simple editor for Markdown and reStructuredText"
DESCRIPTION = "ReText is simple text editor that supports Markdown and reStructuredText \
markup languages. It is written in Python using PyQt libraries."
LICENSE = "GPL-2.0-or-later"

PV = "8.1.0"

RPM_NAME = "retext-8.1.0-1.3.noarch.rpm"
RPM_HASH = "9ea0afa57febcaa59b51f4b0e0c61a2cc4f7335f79f4a9397a13726efd3e35eb27bc3c31625df4baafc4db0f52507aa19829a8887097017148d51b630d12ecb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ReText \
python3.13dist-retext \
python3dist-retext \
retext"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-Markdown \
python3-Markups \
python3-Pygments \
python3-docutils \
python3-qt6"

inherit rpm
