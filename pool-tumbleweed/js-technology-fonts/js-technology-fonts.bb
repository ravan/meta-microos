SUMMARY = "JS Technology fonts"
DESCRIPTION = "JS Technology fonts were initially created to support Thai language for desktop publishing in Windows operating system. \
Which was later adapted for sewing machine patterns."
LICENSE = "GPL-2.0+"

PV = "0.0+git.1515043414.01c39b7"

RPM_NAME = "js-technology-fonts-0.0+git.1515043414.01c39b7-1.17.noarch.rpm"
RPM_HASH = "a032d6b4d29e6c8e4e09d7ea442ed3668f7dedd661eb332a701c8b97fcfce4bbebab1f1006bdf4c700a43934740f8cc8c7225f0beed94a04bed1f40020507a6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "js-technology-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
