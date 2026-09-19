SUMMARY = "Pony Object-Relational Mapper"
DESCRIPTION = "Pony ORM is a object-relational mapper for Python. Using Pony, users \
can create and maintain database-oriented software applications. Pony \
is able to write queries to the database using generator expressions. \
Pony then analyzes the abstract syntax tree of a generator and \
translates it to its SQL equivalent."
LICENSE = "Apache-2.0"

PV = "0.7.19"

RPM_NAME = "python313-pony-0.7.19-5.1.noarch.rpm"
RPM_HASH = "67a84c0ad1cd015c29585a4a73e75f4c222b6b4fe1be9101b477b2b42d112d2952f5a8ddbae50a1ed79f4a759f9fa3647a4c626d184e823b2e58fb6800e95681"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pony \
python3.13dist-pony \
python313-pony \
python3dist-pony"

RDEPENDS:${PN} += "python-abi \
python313"

inherit rpm
