SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "openSUSE-release-livecd-xfce-20260915-3446.1.aarch64.rpm"
RPM_HASH = "43a067924b624807ec2e46c4798f0f95e74db23b8f4ad7d59f41ef12ae5d1dead2fc21d8be8e52148335d22377f065c59d6ac82865c7e0d92d6ad36d76e05db9"

RPROVIDES:${PN} += "flavor-livecd-xfce \
openSUSE-release-livecd-xfce \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
