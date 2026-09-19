SUMMARY = "A library to calculate python dependency graphs"
DESCRIPTION = "A library to calculate python dependency graphs."
LICENSE = "Apache-2.0"

PV = "0.8.1"

RPM_NAME = "python314-importlab-0.8.1-2.5.noarch.rpm"
RPM_HASH = "23f783a9b2101a8194d4616c30b29265698af0e2d02c0b7af76f5bccf501b8328f713a3792b9be8b2b4458168bc66b0d803222d4d3fd7ff86a662002eb8102f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-importlab \
python314-importlab \
python3dist-importlab"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-networkx"

inherit rpm
