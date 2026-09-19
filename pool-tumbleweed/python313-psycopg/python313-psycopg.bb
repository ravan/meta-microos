SUMMARY = "PostgreSQL database adapter for Python"
DESCRIPTION = "PostgreSQL database adapter for Python"
LICENSE = "LGPL-3.0-only"

PV = "3.3.4"

RPM_NAME = "python313-psycopg-3.3.4-2.1.noarch.rpm"
RPM_HASH = "a09e1ee563388b3f94322ca451e8bab6848135af63b23eb35047b7dedc4fdc85f82d2277f32cebc1c62bd4ad23b15045ab27bf2fb576abe2381e75df1e01931a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-psycopg \
python3.13dist-psycopg \
python313-psycopg \
python3dist-psycopg"

RDEPENDS:${PN} += "python-abi \
python313-psycopg-c \
python313-typing-extensions"

inherit rpm
