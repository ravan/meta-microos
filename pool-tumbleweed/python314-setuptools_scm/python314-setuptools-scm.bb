SUMMARY = "Python setuptools handler for SCM tags"
DESCRIPTION = "The setuptools_scm package handles managing one's Python package versions \
in SCM metadata. It also handles file finders for the supperted SCMs."
LICENSE = "MIT"

PV = "10.0.5"

RPM_NAME = "python314-setuptools_scm-10.0.5-1.3.noarch.rpm"
RPM_HASH = "9ebe91e5160a284b40f61069db6a97f43be0b6e491f053fb3a11e45101b6a36084e68311ddba83333894054ea0c337bd521b932ee66f34a3b3c636aa94bb1c58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-setuptools-scm \
python314-setuptools-scm \
python3dist-setuptools-scm"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
alts \
python-abi \
python314-packaging \
python314-setuptools \
python314-vcs-versioning"

inherit rpm
