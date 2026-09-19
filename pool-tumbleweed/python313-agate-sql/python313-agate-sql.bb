SUMMARY = "SQL read/write support for agate"
DESCRIPTION = "Agate-sql adds SQL read/write support to agate."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "python313-agate-sql-0.7.3-1.3.noarch.rpm"
RPM_HASH = "41d0bcdc6e5838e367271f2a8a553b957b8dce67150edeaf0f2b059d43a8a5feae72b50cb111d7b5855eff6c746257af64d0e35cf32b1f32077e8b94964ac622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-agate-sql \
python3.13dist-agate-sql \
python313-agate-sql \
python3dist-agate-sql"

RDEPENDS:${PN} += "python-abi \
python313-SQLAlchemy \
python313-agate"

inherit rpm
