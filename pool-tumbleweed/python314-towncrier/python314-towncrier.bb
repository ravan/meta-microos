SUMMARY = "Building newsfiles for your project"
DESCRIPTION = "Building newsfiles for your project."
LICENSE = "MIT"

PV = "25.8.0"

RPM_NAME = "python314-towncrier-25.8.0-1.3.noarch.rpm"
RPM_HASH = "c277fc548a522abfac5d13ba778629ec336e4d600f50ef988c97cc7395e00e04847db83683424dc1949f5475fe5822da130f23ad56e21fb5171b4ed46dc2647c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-towncrier \
python314-towncrier \
python3dist-towncrier"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
git-core \
python-abi \
python314-Jinja2 \
python314-click \
update-alternatives"

inherit rpm
