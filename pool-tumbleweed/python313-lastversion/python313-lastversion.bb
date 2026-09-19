SUMMARY = "Find the latest stable release version of an arbitrary project"
DESCRIPTION = "lastversion is a command-line tool and Python library to find the latest \
stable release version of an arbitrary project. It supports GitHub, GitLab, \
Bitbucket, PyPI, Mercurial, SourceForge, WordPress and more, handling \
inconsistent versioning schemes, pre-release detection, and asset filtering."
LICENSE = "BSD-2-Clause"

PV = "3.6.17"

RPM_NAME = "python313-lastversion-3.6.17-1.1.noarch.rpm"
RPM_HASH = "ec33592fdb9c36ce9291bbc6fded746186459566d7d264be258fe8fae8f35d4d9ad324918da8c3e0bb590b9d3269ec7c7dfdbce6bc5db11e3f54c0e2c2fa88e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lastversion \
python3.13dist-lastversion \
python313-lastversion \
python3dist-lastversion"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-CacheControl \
python313-PyYAML \
python313-appdirs \
python313-beautifulsoup4 \
python313-distro \
python313-feedparser \
python313-packaging \
python313-python-dateutil \
python313-requests \
python313-tqdm \
update-alternatives"

inherit rpm
