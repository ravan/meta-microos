SUMMARY = "Dynamic version generation"
DESCRIPTION = "Dunamai is a Python 3.5+ library and command line tool for producing dynamic, \
standards-compliant version strings, derived from tags in your version \
control system. This facilitates uniquely identifying nightly or per-commit \
builds in continuous integration and releasing new versions of your software \
simply by creating a tag."
LICENSE = "MIT"

PV = "1.26.2"

RPM_NAME = "python314-dunamai-1.26.2-1.1.noarch.rpm"
RPM_HASH = "5ede25dee7940188d31e6a2e507ea0d2440faf89e936d886b631e8ddcdb119d849b315fb9650e8d5de09a7c12263af85cc01459d41ab327bf193462a0950c14c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dunamai \
python314-dunamai \
python3dist-dunamai"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
alts \
python-abi \
python314-packaging"

inherit rpm
