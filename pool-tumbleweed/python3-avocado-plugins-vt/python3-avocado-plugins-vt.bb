SUMMARY = "Avocado Virt Test Plugin"
DESCRIPTION = "Avocado Virt Test is a plugin that executes virt-tests with all the avocado \
features, such as HTML report and Xunit output, among others."
LICENSE = "GPL-2.0-only"

PV = "113.0"

RPM_NAME = "python3-avocado-plugins-vt-113.0-1.2.noarch.rpm"
RPM_HASH = "5adc90684b611f06ee96c8c82d9c480b53cf83d83b4365b072fc79dafb42f26a839e0c1bea084d961cb3f263e88f7a2d82d6b754d103943dd113c7bf6156db28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python3-avocado-plugins-vt \
python3-avocado-plugins-vt \
python3.13dist-avocado-framework-plugin-vt \
python3dist-avocado-framework-plugin-vt"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
attr \
bridge-utils \
gcc \
git-core \
glibc-devel \
iproute \
iputils \
make \
netcat-openbsd \
openvswitch \
python-abi \
python3-aexpect \
python3-avocado \
python3-dbm \
python3-devel \
python3-packaging \
python3-six \
qemu-kvm \
systemtap \
tcpdump \
xz"

inherit rpm
