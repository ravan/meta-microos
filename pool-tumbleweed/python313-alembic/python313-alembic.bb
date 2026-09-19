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

RPM_NAME = "python313-alembic-1.18.5-1.2.noarch.rpm"
RPM_HASH = "0be579e333194cfc253ef00bcc6c38ae46b4ffb8aedbff65532a3e982b20ff10f12b9bbd3a218153605ca7d5fbc5420f1b9165fa98b26420ab8c3cfc4979013e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-alembic \
python3.13dist-alembic \
python313-alembic \
python3dist-alembic"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Mako \
python313-SQLAlchemy \
python313-typing-extensions"

inherit rpm
