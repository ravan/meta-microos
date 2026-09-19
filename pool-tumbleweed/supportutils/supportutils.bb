SUMMARY = "Support Troubleshooting Tools"
DESCRIPTION = "A package containing troubleshooting tools. This package contains \
the following: supportconfig, chkbin, getappcore, analyzevmcore"
LICENSE = "GPL-2.0-only"

PV = "3.2.14.2"

RPM_NAME = "supportutils-3.2.14.2-1.2.noarch.rpm"
RPM_HASH = "f0f0825f05c18e5b1be91c847246ad7335807a109627980575267dd4200146e1ab5916a9b435c486055727bf6e7c333747762d22a9707d6dced8eca7927aaaf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "supportconfig-plugin-rc \
supportutils"

RDEPENDS:${PN} += "/usr/bin/bash \
coreutils \
file \
findutils \
gawk \
grep \
sed \
tar"

inherit rpm
