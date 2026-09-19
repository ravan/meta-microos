SUMMARY = "Connection Pool for Psycopg"
DESCRIPTION = "Connection Pool for Psycopg"
LICENSE = "LGPL-3.0-only"

PV = "3.3.0"

RPM_NAME = "python313-psycopg-pool-3.3.0-1.4.noarch.rpm"
RPM_HASH = "566ac72d5bfe2f533bd4fcf0f301739df8c298a639b70f2ebbeb7e3679cdaff683bef619e1abd8f3dc740385c44701e637b033e12af5b79fd6cfd7cf93705d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-psycopg-pool \
python3.13dist-psycopg-pool \
python313-psycopg-pool \
python3dist-psycopg-pool"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
