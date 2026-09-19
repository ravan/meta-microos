SUMMARY = "Pony Object-Relational Mapper"
DESCRIPTION = "Pony ORM is a object-relational mapper for Python. Using Pony, users \
can create and maintain database-oriented software applications. Pony \
is able to write queries to the database using generator expressions. \
Pony then analyzes the abstract syntax tree of a generator and \
translates it to its SQL equivalent."
LICENSE = "Apache-2.0"

PV = "0.7.19"

RPM_NAME = "python314-pony-0.7.19-5.1.noarch.rpm"
RPM_HASH = "56600ca49738e41f780c58ec0d5a59a4b8a22a3d8dd6e05842730c8e02678326be0116d32e8f9c9d238782f19463215440b7cc1cc2a561324b23d544f70bc4a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pony \
python314-pony \
python3dist-pony"

RDEPENDS:${PN} += "python-abi \
python314"

inherit rpm
