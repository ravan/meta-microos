SUMMARY = "Release Notes for openSUSE"
DESCRIPTION = "This package contains the release notes with the most important changes \
for openSUSE Tumbleweed."
LICENSE = "GFDL-1.3"

PV = "84.87.20180228.827b030"

RPM_NAME = "release-notes-openSUSE-84.87.20180228.827b030-1.64.noarch.rpm"
RPM_HASH = "55b5fb20dd5ebbc99daebb55232469aa80f74e21eee70b9e0c11a3cab01562181300e93b5cab77118e3ce63a153815b6932ab779c588fc56f279de52a365905a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "release-notes \
release-notes-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
