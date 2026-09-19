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

RPM_NAME = "python314-django-pglocks-1.0.4-3.8.noarch.rpm"
RPM_HASH = "258ed5e07a66d5290400f875b4b9d8c827c76cc700fc5b00a7a3de41972d74d4e84eca7ae48004b10fd5ace98eb11efc8247ab36fbc814aef6ed31423d334c16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-pglocks \
python314-django-pglocks \
python3dist-django-pglocks"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-psycopg2 \
python314-six"

inherit rpm
