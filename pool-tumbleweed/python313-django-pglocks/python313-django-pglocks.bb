SUMMARY = "PostgreSQL Advisory Locks for Django"
DESCRIPTION = "django-pglocks provides a useful context manager to manage PostgreSQL advisory \
locks. It requires Django (tested with 1.5), PostgreSQL, and (probably) psycopg2. \
 \
Advisory locks are application-level locks that are acquired and released purely \
by the client of the database; PostgreSQL never acquires them on its own. They \
are very useful as a way of signalling to other sessions that a higher-level \
resource than a single row is in use, without having to lock an entire table or \
some other structure. \
 \
It's entirely up to the application to correctly acquire the right lock. \
 \
Advisory locks are either session locks or transaction locks. A session lock is \
held until the database session disconnects (or is reset); a transaction lock is \
held until the transaction terminates. \
 \
Currently, the context manager only creates session locks, as the behavior of a \
lock persisting after the context body has been exited is surprising, and \
there's no way of releasing a transaction-scope advisory lock except to exit \
the transaction."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python313-django-pglocks-1.0.4-3.8.noarch.rpm"
RPM_HASH = "fca9a0d654fdfa956e6da83b7e556fd387e96a7d18633bf80ddb82c2e71eb6bb21a51ca99bd828758bb081343052bbe3d3a9cec58d7dc4ee9d3eacd62fc1c559"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-pglocks \
python3.13dist-django-pglocks \
python313-django-pglocks \
python3dist-django-pglocks"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-psycopg2 \
python313-six"

inherit rpm
