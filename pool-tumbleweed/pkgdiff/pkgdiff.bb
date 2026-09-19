SUMMARY = "Package Changes Analyzer"
DESCRIPTION = "A tool for visualizing changes in Linux software packages (RPM, DEB, TAR.GZ, etc). \
The tool is intended for Linux maintainers who are interested in ensuring \
compatibility of old and new versions of packages."
LICENSE = "GPL-2.0-only"

PV = "1.8"

RPM_NAME = "pkgdiff-1.8-1.6.noarch.rpm"
RPM_HASH = "0c92d67516e78f19ce2e9b8aaa5e4432845544b95e9be00b9feea0a69ddb698edf3bc8db77fec50c97a6b41c2e6fa20b864118db19becfabcf19d76fc6dd6f12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgdiff"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
awk \
binutils \
diff \
perl-base \
wdiff"

inherit rpm
