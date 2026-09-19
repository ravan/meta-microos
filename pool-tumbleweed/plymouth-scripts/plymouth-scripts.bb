SUMMARY = "Plymouth related scripts"
DESCRIPTION = "This package contains scripts that help integrate Plymouth with \
the system."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-scripts-22.02.122+94.4bd41a3-20.6.noarch.rpm"
RPM_HASH = "03eed50775f5dfa3ff499e128c5e81ca251bad26ee7838f4f5f2470b631f5dd9c60f04cb7b250317e02ff080ca544f7d1e740afde8d801d20d5af96d0462a2cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-scripts"

RDEPENDS:${PN} += "/usr/bin/bash \
awk \
dracut \
grep \
plymouth \
sed"

inherit rpm
