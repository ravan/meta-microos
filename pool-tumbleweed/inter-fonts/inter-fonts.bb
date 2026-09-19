SUMMARY = "The Inter font family"
DESCRIPTION = "Inter is a typeface specially designed for user interfaces with focus on high \
legibility of small-to-medium sized text on computer screens."
LICENSE = "OFL-1.1"

PV = "4.1"

RPM_NAME = "inter-fonts-4.1-1.3.noarch.rpm"
RPM_HASH = "bb99881648734d1151f224993c9ad422bca154cded482dc3677a827eb8261b003ac3a1be4d5d75f4f4a17493ebbb78096a5f5c42e2bd4bd12d8494bb216cdd6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "inter-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
