SUMMARY = "Python library to use the GitHub API v3"
DESCRIPTION = "PyGitHub is a Python library to access the GitHub REST API. \
This library enables you to manage [GitHub] resources such as repositories, \
user profiles, and organizations in your Python applications."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "python313-PyGithub-2.9.1-1.2.noarch.rpm"
RPM_HASH = "8b277d7819c98126c9e71c83b20042b6935613572fa75cfcdcd30bc4d5b610c48a8aa395d123a2bddf710f055262eb2a27750f887f6219a0a8bc1489936f0991"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyGithub \
python3-pygithub \
python3.13dist-pygithub \
python313-PyGithub \
python313-pygithub \
python3dist-pygithub"

RDEPENDS:${PN} += "python-abi \
python313-PyJWT \
python313-PyNaCl \
python313-cryptography \
python313-requests \
python313-typing-extensions \
python313-urllib3"

inherit rpm
