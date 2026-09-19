SUMMARY = "SqlAlchemy schema display script"
DESCRIPTION = "SqlAlchemy schema display script"
LICENSE = "BSD-3-Clause"

PV = "0.4.9"

RPM_NAME = "python314-sadisplay-0.4.9-3.5.noarch.rpm"
RPM_HASH = "e06f482a56015ab1f550d9abeeb8992057c853445d9562b6365f328f47884c5dfa3d307039458a0ea620a86bef57bea32629513a2726893622ff73462b8468ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sadisplay \
python314-sadisplay \
python3dist-sadisplay"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-SQLAlchemy"

inherit rpm
