SUMMARY = "Python modules for Ceph iSCSI gateway configuration management"
DESCRIPTION = "Python package providing the modules used to handle the configuration of an \
iSCSI gateway, backed by Ceph RBD. The RPM installs configuration management \
logic (ceph_iscsi_config modules), an rbd-target-gw systemd service, and \
a CLI-based management tool 'gwcli', replacing the 'targetcli' tool. \
 \
The configuration management modules may be are consumed by custom Ansible \
playbooks and the rbd-target-gw daemon. \
 \
The rbd-target-gw service is responsible for startup and shutdown actions, \
replacing the 'target' service used in standalone LIO implementations. \
In addition, rbd-target-gw also provides a REST API utilized by the Ceph \
dashboard and gwcli tool, and a prometheus exporter for gateway LIO \
performance statistics, supporting monitoring and visualisation tools like \
Grafana."
LICENSE = "GPL-3.0-or-later"

PV = "3.5+1679292226.g8769429"

RPM_NAME = "ceph-iscsi-3.5+1679292226.g8769429-1.11.aarch64.rpm"
RPM_HASH = "d81306c0351b60452a1ede7fb143f819ccc0a896bfffd286d4489b3d8e01ed2e013791212f1394997dded10650130209add3adc9679f9380c3540012bc50e503"

RPROVIDES:${PN} += "ceph-iscsi \
python3.13dist-ceph-iscsi \
python3dist-ceph-iscsi"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ceph-common \
python-abi \
python3-Flask \
python3-configshell-fb \
python3-cryptography \
python3-netifaces \
python3-pyOpenSSL \
python3-rados \
python3-rbd \
python3-requests \
python3-rtslib \
systemd \
tcmu-runner"

inherit rpm
