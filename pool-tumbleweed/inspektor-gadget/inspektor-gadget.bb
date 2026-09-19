SUMMARY = "A eBPF tool and systems inspection framework"
DESCRIPTION = "The eBPF tool and systems inspection framework for Kubernetes, containers and \
Linux hosts \
 \
Inspektor Gadget is a collection of tools (or gadgets) to debug and inspect \
Kubernetes resources and applications. It manages the packaging, deployment and \
execution of eBPF programs in a Kubernetes cluster, including many based on BCC \
tools, as well as some developed specifically for use in Inspektor Gadget. It \
automatically maps low-level kernel primitives to high-level Kubernetes \
resources, making it easier and quicker to find the relevant information."
LICENSE = "Apache-2.0"

PV = "0.55.1"

RPM_NAME = "inspektor-gadget-0.55.1-1.1.aarch64.rpm"
RPM_HASH = "6ce9c6a755d579a104abbc075442fe29bfec48c941dc3afcecec8d7111cd1e36cdfa5770c7837afe6e58e27782a90980cd97d3631a99a856c6923cdb89e0bbca"

RPROVIDES:${PN} += "inspektor-gadget"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
