SUMMARY = "Script for generating distribution packages from Python packages on PyPI"
DESCRIPTION = "This script allows to generate RPM spec or DEB dsc files from Python modules. \
It allows to list Python modules or search for them on the Python Package Index \
(PyPI). Conveniently, it can fetch tarballs and changelogs making it an \
universal tool to package Python modules."
LICENSE = "Apache-2.0"

PV = "0.9.1"

RPM_NAME = "python314-py2pack-0.9.1-1.8.noarch.rpm"
RPM_HASH = "bec42abb7e0f1536a7ce0a7b32810026da5927b446b12cfd1b2f7b8b50b8a0ea7b0a88c7860522f11743732665bc06f8a4bebfc43906e99a8c6a208e5b261fdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-py2pack \
python314-py2pack \
python3dist-py2pack"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Jinja2 \
python314-backports.entry-points-selectable \
python314-build \
python314-metaextract \
python314-packaging \
python314-platformdirs \
python314-pypi-search \
python314-requests \
python314-setuptools \
update-alternatives"

inherit rpm
