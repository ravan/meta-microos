SUMMARY = "Python setuptools handler for SCM tags"
DESCRIPTION = "The setuptools_scm package handles managing one's Python package versions \
in SCM metadata. It also handles file finders for the supperted SCMs."
LICENSE = "MIT"

PV = "10.0.5"

RPM_NAME = "python313-setuptools_scm-10.0.5-1.3.noarch.rpm"
RPM_HASH = "85173a89704195fc4c86d738d1d07f207c5429f312b3fe61168b444215ea6e784d35047dd0877b43da678e8f3e141d5bf14edce2b7fc49d416521f6f6f37e3fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-scm \
python3.13dist-setuptools-scm \
python313-setuptools-scm \
python3dist-setuptools-scm"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
alts \
python-abi \
python313-packaging \
python313-setuptools \
python313-vcs-versioning"

inherit rpm
