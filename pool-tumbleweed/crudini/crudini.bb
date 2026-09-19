SUMMARY = "A utility for manipulating ini files"
DESCRIPTION = "A utility for easily handling ini files from the command line and shell \
scripts."
LICENSE = "GPL-2.0-only"

PV = "0.9.6"

RPM_NAME = "crudini-0.9.6-1.3.noarch.rpm"
RPM_HASH = "263a574f5dc5cc499232e37450e3f5cf9742d0ace7d85c160578b7643b736f552572feaa125e32611167652990f582830ec0ccdd27bf6fe1f2f66bcec7cd5691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crudini"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-iniparse"

inherit rpm
