SUMMARY = "Ceph Manager module for cephadm-based orchestration"
DESCRIPTION = "ceph-mgr-cephadm is a ceph-mgr module for orchestration functions using \
the integrated cephadm deployment tool management operations."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "ceph-mgr-cephadm-18.2.7-8.1.noarch.rpm"
RPM_HASH = "292ac49013170b362402da3928e15f38e02d9141bd12b8f495adcb19e0f0d2e7a97a3ca729731ca5687084f0e58da3ce8e36a1aabeee4bc4fa70a3dcf8b50ab6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-cephadm"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-mgr \
cephadm \
openssh \
python3-CherryPy \
python3-Jinja2 \
python3-asyncssh \
python3-natsort"

inherit rpm
