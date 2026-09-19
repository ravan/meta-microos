SUMMARY = "Profiling for the Django Framework"
DESCRIPTION = "Profiling for the Django Framework."
LICENSE = "MIT"

PV = "5.5.2"

RPM_NAME = "python314-django-silk-5.5.2-1.1.noarch.rpm"
RPM_HASH = "fff99b7ac22f36f1ea7bf995a0f3e6b0859994254cf825b456868b0eb5010ec973c880bd453bc2ced5d48bec58661957188c3274ef8ad655ad5195a74718e22f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-silk \
python314-django-silk \
python3dist-django-silk"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-autopep8 \
python314-gprof2dot \
python314-sqlparse"

inherit rpm
