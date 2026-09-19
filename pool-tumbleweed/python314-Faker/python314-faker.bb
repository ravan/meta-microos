SUMMARY = "Python package that generates fake data"
DESCRIPTION = "Faker is a Python package that generates fake data. It helps with \
database bootstrapping, creating XML documents, persistence stress \
testing, and data anonymization from production services."
LICENSE = "MIT"

PV = "40.36.0"

RPM_NAME = "python314-Faker-40.36.0-1.1.noarch.rpm"
RPM_HASH = "31abab9ed53ea26f5f8ec20c1e45c16091b4fcc6087a48d047f7654260834117a65f9770de7e290120cefbe3cc3bbace98a2415385c9953aec21f8374cc5f782"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fake-factory \
python3.14dist-faker \
python314-Faker \
python3dist-faker"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-tzdata"

inherit rpm
