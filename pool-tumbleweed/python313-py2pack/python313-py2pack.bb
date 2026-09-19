SUMMARY = "Script for generating distribution packages from Python packages on PyPI"
DESCRIPTION = "This script allows to generate RPM spec or DEB dsc files from Python modules. \
It allows to list Python modules or search for them on the Python Package Index \
(PyPI). Conveniently, it can fetch tarballs and changelogs making it an \
universal tool to package Python modules."
LICENSE = "Apache-2.0"

PV = "0.9.1"

RPM_NAME = "python313-py2pack-0.9.1-1.8.noarch.rpm"
RPM_HASH = "0b9d40af3e4d77473d04d6cf05621b363e0771bd176863e3b29b334ef3479f1eda2dd767ca932098a5e399c71345dc079c00aad307079cb6c3eb42ca623b4299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py2pack \
python3.13dist-py2pack \
python313-py2pack \
python3dist-py2pack"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Jinja2 \
python313-backports.entry-points-selectable \
python313-build \
python313-metaextract \
python313-packaging \
python313-platformdirs \
python313-pypi-search \
python313-requests \
python313-setuptools \
update-alternatives"

inherit rpm
