SUMMARY = "Tool collecting path entries across SVN history"
DESCRIPTION = "Tool collecting path entries across SVN history. It runs through all SVN history \
collecting additions of directories. In the end it presents a tree of all \
directories ever having existed in the repository."
LICENSE = "GPL-3.0-only"

PV = "1.7.2"

RPM_NAME = "python313-svneverever-1.7.2-2.5.noarch.rpm"
RPM_HASH = "1b566327ddbe635cb075df81be280787d4dccd87faf64fafde4c511362090c22a88a1975a66fe6713f6a678ed27c1fe7c502c504ba9263ffa246301c7dfe0e5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-svneverever \
python3.13dist-svneverever \
python313-svneverever \
python3dist-svneverever"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
subversion \
update-alternatives"

inherit rpm
