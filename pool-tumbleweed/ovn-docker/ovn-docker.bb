SUMMARY = "Docker network plugins for OVN"
DESCRIPTION = "This subpackage contains the OVN Docker network plugins."
LICENSE = "Apache-2.0"

PV = "26.03.2"

RPM_NAME = "ovn-docker-26.03.2-37.1.noarch.rpm"
RPM_HASH = "748d32ae0447e0d1df639859bbaa5536e60a3359a9d769efbb835e084d42d89c1c2d8b198a5654d025b77988ac7148f4c54b5bdbd25d98f626686d0841860b62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openvswitch-dpdk-ovn-/usr/bin/ovn-docker-overlay-driver \
openvswitch-ovn-/usr/bin/ovn-docker-overlay-driver \
openvswitch-ovn-docker \
ovn-docker"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
openvswitch \
ovn \
python3-openvswitch"

inherit rpm
