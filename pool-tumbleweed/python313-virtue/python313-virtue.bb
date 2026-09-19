SUMMARY = "After trial comes virtue. A test runner for good"
DESCRIPTION = "After trial comes virtue. A test runner for good."
LICENSE = "MIT"

PV = "2025.7.1"

RPM_NAME = "python313-virtue-2025.7.1-2.6.noarch.rpm"
RPM_HASH = "07e5deed97c259f603c940bcc1133bbde44de917463b268c58c495a6aa59def27bad7144de4e8dd65993e419b4c257f4cc62b163fc56f30cc608e72b6cd14fe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-virtue \
python3.13dist-virtue \
python313-virtue \
python3dist-virtue"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Twisted \
python313-attrs \
python313-click \
python313-colorama \
python313-pyrsistent"

inherit rpm
