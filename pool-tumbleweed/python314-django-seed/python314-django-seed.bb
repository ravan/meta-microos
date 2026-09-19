SUMMARY = "Django project fake data seeder"
DESCRIPTION = "A module to seed Django projects with fake data."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python314-django-seed-0.3.1-2.7.noarch.rpm"
RPM_HASH = "b4b7185e3ebf00f90d5eb6624d4c14dbd59dbb588a9d884d7e243fda57906ddc6dcaf71d6dc77fcf8e89dc5d86bc2478f07680c8ddef5dd84ab411cf505ad98d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-seed \
python314-django-seed \
python3dist-django-seed"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-Faker \
python314-toposort"

inherit rpm
