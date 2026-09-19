SUMMARY = "Tool collecting path entries across SVN history"
DESCRIPTION = "Tool collecting path entries across SVN history. It runs through all SVN history \
collecting additions of directories. In the end it presents a tree of all \
directories ever having existed in the repository."
LICENSE = "GPL-3.0-only"

PV = "1.7.2"

RPM_NAME = "python314-svneverever-1.7.2-2.5.noarch.rpm"
RPM_HASH = "caa3adebbf8532cea0e3b8e26f12df7f7513cc50797fc2725b3cb895703f41f7099e7bb5d85e9468edc3a803cedeef05b34b8cf5b3c977e3fc81970499f78077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-svneverever \
python314-svneverever \
python3dist-svneverever"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
subversion \
update-alternatives"

inherit rpm
