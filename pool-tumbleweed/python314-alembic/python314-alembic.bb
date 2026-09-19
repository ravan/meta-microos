SUMMARY = "A database migration tool for SQLAlchemy"
DESCRIPTION = "Alembic is a new database migrations tool, written by the author \
of SQLAlchemy <http://www.sqlalchemy.org>.  A migrations tool \
offers the following functionality: \
 \
* Can emit ALTER statements to a database in order to change \
  the structure of tables and other constructs \
* Provides a system whereby 'migration scripts' may be constructed; \
  each script indicates a particular series of steps that can 'upgrade' a \
  target database to a new version, and optionally a series of steps that can \
  'downgrade' similarly, doing the same steps in reverse. \
* Allows the scripts to execute in some sequential manner."
LICENSE = "MIT"

PV = "1.18.5"

RPM_NAME = "python314-alembic-1.18.5-1.2.noarch.rpm"
RPM_HASH = "6822c01e2bcf4c74aca5261e5e670eda3e9a1f9afa9ab115d00d12ed32c828ef00e3281667d6364d1bb902ac9802b527367bc4eecfa90ca24a38573d63781dd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-alembic \
python314-alembic \
python3dist-alembic"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Mako \
python314-SQLAlchemy \
python314-typing-extensions"

inherit rpm
