SUMMARY = "Dependencies required for Adminer PostgreSQL support"
DESCRIPTION = "Virtual package that requires dependencies needed for Adminer PostgreSQL support"
LICENSE = "GPL-2.0-only | Apache-2.0"

PV = "4.8.1"

RPM_NAME = "adminer-pgsql-4.8.1-1.13.noarch.rpm"
RPM_HASH = "361a0b740b794d59c6789c44d87b4e98aafe39b6de480e4dc24836fca377f854c3fefc230894acd86dce29e7310cdecc3b06b1c7f5f73874f77b5bcc487a692b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adminer-database-support \
adminer-pgsql"

RDEPENDS:${PN} += "adminer \
php-pgsql"

inherit rpm
