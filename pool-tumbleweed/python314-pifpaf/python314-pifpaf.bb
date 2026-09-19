SUMMARY = "Suite of tools and fixtures to manage daemons for testing"
DESCRIPTION = "Pifpaf is a suite of `fixtures`_ and a command-line tool that allows to start \
and stop daemons for a quick throw-away usage. This is typically useful when \
needing these daemons to run `integration testing`_. It originaly evolved from \
its precussor `overtest`_."
LICENSE = "Apache-2.0"

PV = "3.4.0"

RPM_NAME = "python314-pifpaf-3.4.0-1.4.noarch.rpm"
RPM_HASH = "cd01aed679c76ee74956fca490806c91ddf2ee0675e5e68e3a1b2db809977e2ad67a8ae3200f2b9161fdc39b9220e7b6353647432b154d7b6e8f0d3dc261afe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pifpaf \
python314-pifpaf \
python3dist-pifpaf"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Jinja2 \
python314-click \
python314-daiquiri \
python314-fixtures \
python314-psutil \
python314-requests \
python314-testrepository \
python314-testtools \
python314-xattr"

inherit rpm
