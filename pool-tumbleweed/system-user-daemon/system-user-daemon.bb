SUMMARY = "System user and group 'daemon'"
DESCRIPTION = "This package provides the system account and group 'daemon' \
and their corresponding directories."
LICENSE = "MIT"

PV = "20250822"

RPM_NAME = "system-user-daemon-20250822-2.3.noarch.rpm"
RPM_HASH = "8b3877534267970ff2f4182418c797822cefaf42b8e18ae8a2b8da5a5fc845ec8fa8b1ec71d7af5f50d25856e184ee178ffe84a5714e0887939a45ae4619a114"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-daemon \
system-user-daemon \
user-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
