SUMMARY = "YAQL - Yet Another Query Language"
DESCRIPTION = "YAQL (Yet Another Query Language) is an embeddable and extensible query \
language, that allows performing complex queries against arbitrary objects. It \
has a vast and comprehensive standard library of frequently used querying \
functions and can be extend even further with user-specified functions. YAQL is \
written in python and is distributed via PyPI."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "python314-yaql-3.2.0-2.2.noarch.rpm"
RPM_HASH = "fdb4e4ab952b1219b78a659a26554df6c87bc782f8e3aa6744aa1356cde8fbddbcca6d50a7acd60d35ff371d10cfec1c36790f26228b03a25ca7dd51362226b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-yaql \
python314-yaql \
python3dist-yaql"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-python-dateutil"

inherit rpm
