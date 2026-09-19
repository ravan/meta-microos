SUMMARY = "The Multiple Git Repository Tool"
DESCRIPTION = "Repo is a tool built on top of Git. Repo helps manage many Git repositories, does the uploads to \
revision control systems, and automates parts of the development  workflow. Repo is not meant to \
replace Git, only to make it easier to work with Git."
LICENSE = "Apache-2.0"

PV = "2.66.1"

RPM_NAME = "git-repo-2.66.1-1.1.noarch.rpm"
RPM_HASH = "050585609204fe9ad65416e0e4bd83f3ffe49307a2df6740208b39ce96b88e035ea9a5c9d265936037d3233ede304bdf7b5c4edb1daec4ad21e5ce5e6913d56d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-repo"

RDEPENDS:${PN} += "/usr/bin/python3 \
git \
python3-base"

inherit rpm
