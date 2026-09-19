SUMMARY = "Ceph Manager module to orchestrate ceph-events to kubernetes' events API"
DESCRIPTION = "ceph-mgr-k8sevents is a ceph-mgr module that sends every ceph-events \
to kubernetes' events API"
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "ceph-mgr-k8sevents-18.2.7-8.1.noarch.rpm"
RPM_HASH = "8b2263208fb76b73416ad05483e57a18249e033227cb498c807116d429f3903e010c33250a667f953569b162509ad4de8369203ce9961e736e1c1c1510cd5dc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-k8sevents"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-mgr \
python3-kubernetes"

inherit rpm
