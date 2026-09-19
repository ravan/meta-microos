SUMMARY = "Ceph Manager module for Rook-based orchestration"
DESCRIPTION = "ceph-mgr-rook is a ceph-mgr module for orchestration functions using \
a Rook backend."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "ceph-mgr-rook-18.2.7-8.1.noarch.rpm"
RPM_HASH = "90b9327e015290cc2332156774e85e4f094e8cf00041bff27bbeb184b1b48ab624f8a50abb4935533d4d5024607573fd4d798f1e297a2180057841c800082dc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-rook"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-mgr \
python3-jsonpatch \
python3-kubernetes"

inherit rpm
