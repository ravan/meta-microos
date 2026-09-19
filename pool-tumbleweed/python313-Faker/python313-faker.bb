SUMMARY = "Python package that generates fake data"
DESCRIPTION = "Faker is a Python package that generates fake data. It helps with \
database bootstrapping, creating XML documents, persistence stress \
testing, and data anonymization from production services."
LICENSE = "MIT"

PV = "40.36.0"

RPM_NAME = "python313-Faker-40.36.0-1.1.noarch.rpm"
RPM_HASH = "61de99269752f4d40e2850a3b4235baa0dc35ccf5ae161ee2d8ba4fd735613ba324b830a7f48c7a1bb9a3207b7eb1e38789cc03f696e18540db33b0deadca59f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Faker \
python3-fake-factory \
python3.13dist-faker \
python313-Faker \
python3dist-faker"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-tzdata"

inherit rpm
