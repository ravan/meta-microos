SUMMARY = "YAML manifests used to install kubevirt"
DESCRIPTION = "This contains the built YAML manifests used to install kubevirt into a \
kubernetes installation with kubectl apply."
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "kubevirt1.9-manifests-1.9.0-3.1.aarch64.rpm"
RPM_HASH = "9f2af2743930023d2a19f0547789fd928613c0cd74f6e9bf46be0125c490e99ca37dc09e654c6db234f21f3aece0a3c16ed651b0f6a5bf562910644ec5d840c3"

RPROVIDES:${PN} += "kubevirt-manifests \
kubevirt1.9-manifests"

RDEPENDS:${PN} += ""

inherit rpm
