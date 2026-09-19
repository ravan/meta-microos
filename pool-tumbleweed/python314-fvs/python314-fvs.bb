SUMMARY = "File Versioning System with hash comparison"
DESCRIPTION = "File Versioning System with hash comparison and data storage to \
create unlinked states that can be deleted \
 \
The main reason for this project is for the purpose of personal \
knowledge and understanding of the versioning system. The second \
reason is to make a simple and easy-to-implement versioning \
system for Bottles. \
 \
There are plenty of other versioning systems out there, but all \
of these provide features that I wouldn't need in my projects. \
The purpose of FVS is to always remain as clear and simple as \
possible, providing only the functionality of organizing file \
versions into states, ie recovery points that take advantage of \
deduplication to minimize space consumption"
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python314-fvs-0.3.4-3.5.noarch.rpm"
RPM_HASH = "30279fd1263b1030a4be1c0b2671db8ca7ed819cacbd00f0e176997e3cf34a88376a1db7992f9dc00e4fde9a6987f0d3930c979921c3eac98255c4f1d528c420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fvs \
python314-fvs \
python3dist-fvs"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-orjson \
update-alternatives"

inherit rpm
