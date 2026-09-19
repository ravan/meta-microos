SUMMARY = "Ceph Manager modules which are always enabled"
DESCRIPTION = "ceph-mgr-modules-core provides a set of modules which are always \
enabled by ceph-mgr."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "ceph-mgr-modules-core-18.2.7-8.1.noarch.rpm"
RPM_HASH = "a3b630a0311cb41604ea627ec1fa157c3ae03eb7b33256c9457a9b102db2c4c80f0150b016077cdd80812a89e7b0f186e36907a1aad6ef89a1747bb25b0c0857"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-modules-core"

RDEPENDS:${PN} += "python3-CherryPy \
python3-PyYAML \
python3-Werkzeug \
python3-bcrypt \
python3-dateutil \
python3-pecan \
python3-pyOpenSSL \
python3-requests \
python3-setuptools"

inherit rpm
