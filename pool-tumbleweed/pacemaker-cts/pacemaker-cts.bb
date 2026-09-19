SUMMARY = "Test framework for cluster-related technologies"
DESCRIPTION = "Test framework for cluster-related technologies like Pacemaker"
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.3+20260728.7052efa194"

RPM_NAME = "pacemaker-cts-3.0.3+20260728.7052efa194-1.1.noarch.rpm"
RPM_HASH = "b2a4a80841035e325db8ba61512c1975e04e7f19005f49f596aa27cfb0d2682c7258eb98197438e8c03bf5ff0ba87d7f228244908870bc5954d7d0e3ed7f16d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pacemaker-cts"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
pacemaker \
procps \
psmisc \
python-abi \
python3 \
python3-pacemaker \
python3-psutil"

inherit rpm
