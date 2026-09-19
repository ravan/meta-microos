SUMMARY = "MARC bibliographic data manipulation module"
DESCRIPTION = "pymarc is a Python library for working with bibliographic data \
encoded in MARC21. It provides an API for reading, writing and \
modifying MARC records. It was originally designed to be an emergency \
eject seat for getting data assets out of MARC and into some kind of \
saner representation."
LICENSE = "BSD-2-Clause"

PV = "5.3.1"

RPM_NAME = "python313-pymarc-5.3.1-1.5.noarch.rpm"
RPM_HASH = "738ed67d1df1d16217137c3a86477261607fe7ecdc792100d948c6e9de2467e5081d56fb4a0ddbaca8665cf3b757c0a20cf5e2373aa928de377685d497662238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymarc \
python3.13dist-pymarc \
python313-pymarc \
python3dist-pymarc"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
