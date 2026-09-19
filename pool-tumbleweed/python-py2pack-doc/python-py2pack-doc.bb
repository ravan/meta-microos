SUMMARY = "Documentation for python-py2pack"
DESCRIPTION = "Documentation and help files for python-py2pack."
LICENSE = "Apache-2.0"

PV = "0.9.1"

RPM_NAME = "python-py2pack-doc-0.9.1-1.8.noarch.rpm"
RPM_HASH = "e754b4de4e9694adf257cc14835c3d37fea15bc154a02718c21e82992e863f93e61eb494a5470ce4f480474ef8652ee4c4beacaef93e0404afa01d022687d2e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-py2pack-doc \
python313-py2pack-doc \
python314-py2pack-doc"

RDEPENDS:${PN} += ""

inherit rpm
