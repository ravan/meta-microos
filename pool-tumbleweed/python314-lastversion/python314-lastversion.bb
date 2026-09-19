SUMMARY = "Find the latest stable release version of an arbitrary project"
DESCRIPTION = "lastversion is a command-line tool and Python library to find the latest \
stable release version of an arbitrary project. It supports GitHub, GitLab, \
Bitbucket, PyPI, Mercurial, SourceForge, WordPress and more, handling \
inconsistent versioning schemes, pre-release detection, and asset filtering."
LICENSE = "BSD-2-Clause"

PV = "3.6.17"

RPM_NAME = "python314-lastversion-3.6.17-1.1.noarch.rpm"
RPM_HASH = "c782a652ec8338b20cbf99e3399240d1dc66c795f94c5d72094d399a470b936e9472a230294816a61d39397749330a7e71e15330bc4a86e517c00d9f4f8ad67c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-lastversion \
python314-lastversion \
python3dist-lastversion"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-CacheControl \
python314-PyYAML \
python314-appdirs \
python314-beautifulsoup4 \
python314-distro \
python314-feedparser \
python314-packaging \
python314-python-dateutil \
python314-requests \
python314-tqdm \
update-alternatives"

inherit rpm
