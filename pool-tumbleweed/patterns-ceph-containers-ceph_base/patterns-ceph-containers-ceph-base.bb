SUMMARY = "Ceph base"
DESCRIPTION = "This provides the base for the Ceph, Rook, Ceph CSI driver packages and containers."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "patterns-ceph-containers-ceph_base-1.0-5.10.aarch64.rpm"
RPM_HASH = "b244d31df5befa7aa7a718981e7e76fa783c4e8f875b82ed0803cb1c41443b580bb8d084e50f41bbc7404f1d4eb9a7ce47c149f79f89eee3a357d9b08c5d0f80"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-ceph-containers-ceph-base"

RDEPENDS:${PN} += "ca-certificates \
ceph \
ceph-base \
ceph-common \
ceph-fuse \
ceph-grafana-dashboards \
ceph-iscsi \
ceph-mds \
ceph-mgr \
ceph-mgr-cephadm \
ceph-mgr-dashboard \
ceph-mgr-diskprediction-local \
ceph-mgr-rook \
ceph-mon \
ceph-osd \
ceph-prometheus-alerts \
ceph-radosgw \
cephadm \
e2fsprogs \
gptfdisk \
kmod \
lvm2 \
rbd-mirror \
rbd-nbd \
tcmu-runner-handler-rbd"

inherit rpm
