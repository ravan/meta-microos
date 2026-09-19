SUMMARY = "RPM dependency generator for Python"
DESCRIPTION = "Tools for packaging Python projects with rpm"
LICENSE = "GPL-2.0-or-later"

PV = "20210526+a18ca48"

RPM_NAME = "python-rpm-packaging-20210526+a18ca48-1.19.noarch.rpm"
RPM_HASH = "4c8d9c34d36655120efc80b17369f51b9da8609529c87bf69d77a5fb467ace7f9abe808cff17d9be5bdff446270b6c459ef2f027bcb961e17b21955e33b052cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-rpm-packaging \
rpm-build-python"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
python-rpm-macros \
python3-base \
python3-packaging"

inherit rpm
