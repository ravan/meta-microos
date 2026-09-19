SUMMARY = "Ceph Dashboard"
DESCRIPTION = "ceph-mgr-dashboard is a manager module, providing a web-based application \
to monitor and manage many aspects of a Ceph cluster and related components. \
See the Dashboard documentation at http://docs.ceph.com/ for details and a \
detailed feature overview."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "ceph-mgr-dashboard-18.2.7-8.1.noarch.rpm"
RPM_HASH = "8e9c5504638844f9c185564b7d2c5b7621ddf40fa5f51cf79648557c24f7b00f7e94ca7e7e9fd38b6721dedf507f25a533fd93998418ebd2915c3aa839dc4b90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-dashboard"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-grafana-dashboards \
ceph-mgr \
ceph-prometheus-alerts \
python3-CherryPy \
python3-Routes \
python3-Werkzeug \
python3-setuptools"

inherit rpm
