SUMMARY = "Dynamic version generation"
DESCRIPTION = "Dunamai is a Python 3.5+ library and command line tool for producing dynamic, \
standards-compliant version strings, derived from tags in your version \
control system. This facilitates uniquely identifying nightly or per-commit \
builds in continuous integration and releasing new versions of your software \
simply by creating a tag."
LICENSE = "MIT"

PV = "1.26.2"

RPM_NAME = "python313-dunamai-1.26.2-1.1.noarch.rpm"
RPM_HASH = "63ea7de7b502bf6026ea539d4a0d63f1290858f9a26df071bf1f4cc8a0ea904334f3f51324b8700bed4d13488772dcab610eac31a6650a8f3ffd508c78d100d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dunamai \
python3.13dist-dunamai \
python313-dunamai \
python3dist-dunamai"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
alts \
python-abi \
python313-packaging"

inherit rpm
