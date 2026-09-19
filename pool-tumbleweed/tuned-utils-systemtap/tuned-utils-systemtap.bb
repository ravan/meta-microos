SUMMARY = "Disk and net statistic monitoring systemtap scripts"
DESCRIPTION = "This package contains several systemtap scripts to allow detailed \
manual monitoring of the system. Instead of the typical IO/sec it collects \
minimal, maximal and average time between operations to be able to \
identify applications that behave power inefficient (many small operations \
instead of fewer large ones)."
LICENSE = "GPL-2.0-or-later"

PV = "2.27.0.0+git.38d4414"

RPM_NAME = "tuned-utils-systemtap-2.27.0.0+git.38d4414-1.2.noarch.rpm"
RPM_HASH = "75f0f2eb8afef429fa85a06cf53a08ee54540f3ec5f2fb9cbfb73451d042196cd177b3d99a6afd745411f614e6c793422b1a6eab289ff79aea05f2eabb5e5243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-utils-systemtap"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/stap \
systemtap \
tuned"

inherit rpm
