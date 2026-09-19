SUMMARY = "Additional tuned profile(s) targeted to PostgreSQL server loads"
DESCRIPTION = "Additional tuned profile(s) targeted to PostgreSQL server loads."
LICENSE = "GPL-2.0-or-later"

PV = "2.27.0.0+git.38d4414"

RPM_NAME = "tuned-profiles-postgresql-2.27.0.0+git.38d4414-1.2.noarch.rpm"
RPM_HASH = "1efaa1b68b6152265a5ffc9c928f29a73d51eb37e59c3ada6d21f0237b26514ca71d9fb503114c06715700811911ff7b739a7c2197bff4dd17ce96a2c24c1633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-profiles-postgresql"

RDEPENDS:${PN} += "tuned"

inherit rpm
