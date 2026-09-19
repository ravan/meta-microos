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

RPM_NAME = "python313-pickleshare-0.7.5-6.5.noarch.rpm"
RPM_HASH = "5209e08483ae5b9689a9b94b5ad49bb2b200f51185ea2046245ee51f0a3b10cde1e8e3de6956a212b02448d1f434bd9e04b8d1517ed5b954e4dbe6c9ce212e1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pickleshare \
python3.13dist-pickleshare \
python313-pickleshare \
python3dist-pickleshare"

RDEPENDS:${PN} += "python-abi"

inherit rpm
