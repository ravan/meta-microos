SUMMARY = "Python setuptools handler for SCM tags"
DESCRIPTION = "The setuptools_scm package handles managing one's Python package versions \
in SCM metadata. It also handles file finders for the supperted SCMs."
LICENSE = "MIT"

PV = "10.0.5"

RPM_NAME = "python311-setuptools_scm-10.0.5-1.3.noarch.rpm"
RPM_HASH = "71c2518514ed8e8619c61b66a12f8cf39f7a4894e51dcda1c5fa1a5da3ea3e7d5a41977eca338eade88dd9fd00c2e8f4f79f728f0f848442c417c33ddcee47bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-setuptools-scm \
python311-setuptools-scm \
python3dist-setuptools-scm"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
alts \
python-abi \
python311-packaging \
python311-setuptools \
python311-vcs-versioning"

inherit rpm
