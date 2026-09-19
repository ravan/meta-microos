SUMMARY = "YAQL - Yet Another Query Language"
DESCRIPTION = "YAQL (Yet Another Query Language) is an embeddable and extensible query \
language, that allows performing complex queries against arbitrary objects. It \
has a vast and comprehensive standard library of frequently used querying \
functions and can be extend even further with user-specified functions. YAQL is \
written in python and is distributed via PyPI."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "python313-yaql-3.2.0-2.2.noarch.rpm"
RPM_HASH = "01d2e176f4974a59a62ec8a6c0fa7c970e8aba3699416670959d075afe633dce3ee481b3249749fcc9a549d91554efced80bab84cd1ae4edfda967059a2e8e29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yaql \
python3.13dist-yaql \
python313-yaql \
python3dist-yaql"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-python-dateutil"

inherit rpm
