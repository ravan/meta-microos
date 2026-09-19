SUMMARY = "Python module for interacting with the GitLab API"
DESCRIPTION = "The python-gitlab package provides access to the GitLab server API. \
 \
It supports the v4 API of GitLab, and provides a CLI tool (gitlab)."
LICENSE = "LGPL-3.0-only"

PV = "8.5.0"

RPM_NAME = "python314-python-gitlab-8.5.0-1.1.noarch.rpm"
RPM_HASH = "8bf10ec469368214a2f61aa3ec25327b436d81b9d8db1c23ceae1ca3619d776e6f73b484ea4f48c3480cfa580d0b15b5238d9299751558356ba78ac11a5031b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-gitlab \
python314-python-gitlab \
python3dist-python-gitlab"

RDEPENDS:${PN} += "-python314-argcomplete >= 1.10.0 with python314-argcomplete < 4 \
-python314-gql >= 3.5.2 with python314-gql < 5 \
/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-requests \
python314-requests-toolbelt \
update-alternatives"

inherit rpm
