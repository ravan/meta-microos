SUMMARY = "Python library to use the GitHub API v3"
DESCRIPTION = "PyGitHub is a Python library to access the GitHub REST API. \
This library enables you to manage [GitHub] resources such as repositories, \
user profiles, and organizations in your Python applications."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "python314-PyGithub-2.9.1-1.2.noarch.rpm"
RPM_HASH = "10a44532ed3a12cec707781e7541e6486bb379bfd132a66263409cb65d98be86b17fd69e3e79a7c24e5d8d0b9a0bc72e08c8248fa45e6b7c3084bc861c738f57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pygithub \
python314-PyGithub \
python314-pygithub \
python3dist-pygithub"

RDEPENDS:${PN} += "python-abi \
python314-PyJWT \
python314-PyNaCl \
python314-cryptography \
python314-requests \
python314-typing-extensions \
python314-urllib3"

inherit rpm
