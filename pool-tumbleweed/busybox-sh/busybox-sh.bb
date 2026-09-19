SUMMARY = "Busybox sh, ash and hush"
DESCRIPTION = "This package contains the busybox sh, ash and hush."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-sh-1.38.0-42.2.noarch.rpm"
RPM_HASH = "40d52fa84ef8b5c0cc7adabeff35a5a2708e08d3ceb14e94171ae37b31a4d7f4d8ecacae758b39d62c548a9134406ecd4f15240e6d680dad564a961e334af2d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/sh \
alternative-sh \
busybox-sh"

RDEPENDS:${PN} += "busybox"

inherit rpm
