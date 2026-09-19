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

RPM_NAME = "python313-fvs-0.3.4-3.5.noarch.rpm"
RPM_HASH = "b91a7b4de368b7407dbb452798a041a68cfa4491009dd4e311d3658a3cc924563d497ac694b9979b92e78cd54041eb378a8ba988e8e499c7c458c26a361a3a34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fvs \
python3.13dist-fvs \
python313-fvs \
python3dist-fvs"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-orjson \
update-alternatives"

inherit rpm
