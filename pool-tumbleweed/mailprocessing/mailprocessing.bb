SUMMARY = "Maildir and IMAP processor/filter using Python 3x as its configuration language"
DESCRIPTION = "The maildirproc and imapproc utilities provided by this package filter emails \
in maildirs and IMAP folders with a user provided filter script written in \
Python."
LICENSE = "GPL-2.0-only"

PV = "1.2.7"

RPM_NAME = "mailprocessing-1.2.7-2.3.noarch.rpm"
RPM_HASH = "db0354e5bf969e7223898701aa9427776f46eb50803f2b99612ecae684c7377f43a38f2d4fe7d3bff1c331e15abf5e079512539492451ae9866e0f0e3fb1c192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maildirproc \
mailprocessing \
python3.13dist-mailprocessing \
python3dist-mailprocessing"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3"

inherit rpm
