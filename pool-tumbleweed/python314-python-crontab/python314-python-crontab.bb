SUMMARY = "Python Crontab API"
DESCRIPTION = "Crontab module for reading and writing crontab files and \
accessing the system cron automatically using an API."
LICENSE = "LGPL-3.0-only"

PV = "3.3.0"

RPM_NAME = "python314-python-crontab-3.3.0-2.3.noarch.rpm"
RPM_HASH = "9639687d576cd95a4b6dabcf6d09ce23b82e66227d950d2ed09cc0ee3438d91e884a66240e1f9d6d5c39615bb340ee0bb88795a60ebdbe687f6caf86cffd43b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-crontab \
python314-python-crontab \
python3dist-python-crontab"

RDEPENDS:${PN} += "python-abi"

inherit rpm
