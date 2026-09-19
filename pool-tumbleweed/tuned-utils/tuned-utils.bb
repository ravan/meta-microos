SUMMARY = "Disk and net statistic monitoring systemtap scripts"
DESCRIPTION = "This package contains utilities that can help you to fine tune your \
system and manage tuned profiles."
LICENSE = "GPL-2.0-or-later"

PV = "2.27.0.0+git.38d4414"

RPM_NAME = "tuned-utils-2.27.0.0+git.38d4414-1.2.noarch.rpm"
RPM_HASH = "241aa54978c59312f5824febb017fa7f5f794e3c6d34f644a93041e00ded0d8760754771382f1a99f1eef78d7ad4f8c34d4a4b20b1c529f265a227511e624673"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-utils"

RDEPENDS:${PN} += "/usr/bin/python3 \
powertop \
tuned"

inherit rpm
