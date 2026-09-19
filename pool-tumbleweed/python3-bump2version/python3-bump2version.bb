SUMMARY = "Version-bump software with a single command"
DESCRIPTION = "A command line tool handling the release process of software by updating all \
version strings in the source code by the correct increment. Also creates \
commits and tags. Version formats are configurable' works without any VCS, but \
can read tag information from and writes commits and tags to Git and Mercurial \
if available; handles text files, so it's not specific to any programming \
language. \
 \
This package obsoletes bumpversion."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python3-bump2version-1.0.1-5.2.noarch.rpm"
RPM_HASH = "66dd1fb9e8c0078b11bf35c261a967a7802505b3510dd70555c754e00fce45b8c89620b991ce8c18b57ce3922e26b97d9cbbbde7ce3e002a211bb0589473c3da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bump2version \
python3.13dist-bump2version \
python3dist-bump2version"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
