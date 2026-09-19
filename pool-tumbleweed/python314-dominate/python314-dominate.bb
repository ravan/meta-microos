SUMMARY = "Python library for creating and manipulating HTML documents"
DESCRIPTION = "Dominate is a Python library for creating and manipulating HTML \
documents using an elegant DOM API. \
 \
It allows you to write HTML pages in pure Python very concisely, \
which eliminates the need to learn another template language, and \
lets you take advantage of the more powerful features of Python."
LICENSE = "GPL-3.0-only"

PV = "2.9.1"

RPM_NAME = "python314-dominate-2.9.1-2.9.noarch.rpm"
RPM_HASH = "a4c96e78cb522c743a58db9634f20ccab899eebfffff3a311603f927fae0f38f254d0ceee79c6d9968ecc53831697746315926aad464fbcf5797b6a9a3af40c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dominate \
python314-dominate \
python3dist-dominate"

RDEPENDS:${PN} += "python-abi"

inherit rpm
