SUMMARY = "Python Git Library"
DESCRIPTION = "GitPython is a python library used to interact with Git repositories. \
 \
GitPython provides object model read and write access to your git repository. \
Access repository information conveniently, alter the index directly, handle \
remotes, or go down to low-level object database access with big-files support. \
 \
With the new object database abstraction added in 0.3, its even possible to \
implement your own storage mechanisms, the currently available implementations \
are 'cgit' and pure python, which is the default."
LICENSE = "BSD-3-Clause"

PV = "3.1.61"

RPM_NAME = "python314-GitPython-3.1.61-1.1.noarch.rpm"
RPM_HASH = "df5fc6f4e39531420914db0b23871cb0e085c372daaba7675762a8360e6680b8ea29abbc5c8e983ba9db234d5338aa3a5446a5f06ae4d29dfa4500679e40c272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gitpython \
python314-GitPython \
python3dist-gitpython"

RDEPENDS:${PN} += "git-core \
python-abi \
python314-gitdb"

inherit rpm
