SUMMARY = "Creates virt-builder index file part from kiwi job"
DESCRIPTION = "OBS kiwi_post_run hook to create virt-builder site index part out of a kiwi \
job."
LICENSE = "MIT"

PV = "0.3"

RPM_NAME = "infos-creator-rpm-0.3-2.18.noarch.rpm"
RPM_HASH = "ad4e288d59f90c8928489f2aff134e5947ca53f14773e376e89a151ea0b40064369934c8da3f11e12f3749a4b45a384cd1cf8f43a51702dfec01812c3860f1e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "infos-creator-rpm \
kiwi-post-run"

RDEPENDS:${PN} += "/usr/bin/sh \
qemu-tools \
xz"

inherit rpm
