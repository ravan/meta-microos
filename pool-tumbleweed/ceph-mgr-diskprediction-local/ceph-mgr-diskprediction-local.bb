SUMMARY = "Ceph Manager module for predicting disk failures"
DESCRIPTION = "ceph-mgr-diskprediction-local is a ceph-mgr module that tries to predict \
disk failures using local algorithms and machine-learning databases."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "ceph-mgr-diskprediction-local-18.2.7-8.1.noarch.rpm"
RPM_HASH = "0e01ff5316256f2f7c1730483420c364898a688fafa985f843973ccf1837a424d6f0f0b298f75951f3db3b2251120c1d72da2aee680fa490faf1dadff04967db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-diskprediction-local"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-mgr \
python3-numpy \
python3-scikit-learn \
python3-scipy"

inherit rpm
