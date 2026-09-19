SUMMARY = "Tiny shelve-like database with concurrency support"
DESCRIPTION = "PickleShare - a small 'shelve' like datastore with concurrency support \
 \
Like shelve, a PickleShareDB object acts like a normal dictionary. Unlike shelve, \
many processes can access the database simultaneously. Changing a value in \
database is immediately visible to other processes accessing the same database. \
 \
Concurrency is possible because the values are stored in separate files. Hence \
the 'database' is a directory where *all* files are governed by PickleShare. \
 \
This module is certainly not ZODB, but can be used for low-load \
(non-mission-critical) situations where tiny code size trumps the \
advanced features of a 'real' object database. \
 \
Installation guide: pip install path pickleshare"
LICENSE = "MIT"

PV = "0.7.5"

RPM_NAME = "python314-pickleshare-0.7.5-6.5.noarch.rpm"
RPM_HASH = "d0e66495c262f6fba8e822801e3d74845cd4360abf7e81a198a7a386accdaa795261a3866ec6940d474ff25b2544861c79ad7293a69fd1cead62ed40215104e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pickleshare \
python314-pickleshare \
python3dist-pickleshare"

RDEPENDS:${PN} += "python-abi"

inherit rpm
