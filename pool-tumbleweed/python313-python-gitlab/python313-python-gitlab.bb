SUMMARY = "Python module for interacting with the GitLab API"
DESCRIPTION = "The python-gitlab package provides access to the GitLab server API. \
 \
It supports the v4 API of GitLab, and provides a CLI tool (gitlab)."
LICENSE = "LGPL-3.0-only"

PV = "8.5.0"

RPM_NAME = "python313-python-gitlab-8.5.0-1.1.noarch.rpm"
RPM_HASH = "a17351179b79f630d403eb5eaa4d593e49d553c60f770ee94ea647ad017128f15c2170575cd9900d27b2eabafb666e5319b5adb37e414c10232e09289385787c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-gitlab \
python3.13dist-python-gitlab \
python313-python-gitlab \
python3dist-python-gitlab"

RDEPENDS:${PN} += "-python313-argcomplete >= 1.10.0 with python313-argcomplete < 4 \
-python313-gql >= 3.5.2 with python313-gql < 5 \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-requests \
python313-requests-toolbelt \
update-alternatives"

inherit rpm
