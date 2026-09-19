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

RPM_NAME = "python313-GitPython-3.1.61-1.1.noarch.rpm"
RPM_HASH = "fea7885f5f931253d8ae0e40da7017eaee2e43278b6f4a6c86941a6b451f3bafdaa3be9c1f1d0bcf36f346bb24476cb1d51f436d3ae948ff8f8a29db8ef36922"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-GitPython \
python3.13dist-gitpython \
python313-GitPython \
python3dist-gitpython"

RDEPENDS:${PN} += "git-core \
python-abi \
python313-gitdb"

inherit rpm
