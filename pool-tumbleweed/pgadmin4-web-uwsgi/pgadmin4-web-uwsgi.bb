SUMMARY = "Pgamdin4 - uwsgi configuration"
DESCRIPTION = "pgadmin4 is a management tool for PostgreSQL. \
 \
This package holds the uwsgi configuration."
LICENSE = "PostgreSQL"

PV = "9.17"

RPM_NAME = "pgadmin4-web-uwsgi-9.17-1.1.noarch.rpm"
RPM_HASH = "edf8e48dc46bc6e8f52f6564819a92ca11c67e8ef9d921d404813ba5b6f4e94bb735fd8ec860a7fc0678f523e7352316885d379b99212db13cab9838a5bb2b85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pgadmin4-web-uwsgi \
pgadmin4-web-uwsgi"

RDEPENDS:${PN} += "pgadmin4 \
uwsgi"

inherit rpm
