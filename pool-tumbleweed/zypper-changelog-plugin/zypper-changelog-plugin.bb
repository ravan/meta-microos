SUMMARY = "Changelog listing tool"
DESCRIPTION = "This tool is to show the changelog of packages in the repository"
LICENSE = "GPL-2.0-only"

PV = "0.6"

RPM_NAME = "zypper-changelog-plugin-0.6-1.6.noarch.rpm"
RPM_HASH = "aaf82b863e1b8a2cd30cf9c830e7b8feba73ae9636d1fc1a3c6a27014790b520503f75686ec9e12925f1783cc11e4d2a790275c110749720fca76fdefa350f3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zypper-changelog-plugin"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-requests \
python3-rpm \
zstd"

inherit rpm
