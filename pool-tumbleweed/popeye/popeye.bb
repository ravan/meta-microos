SUMMARY = "A Kubernetes cluster resource sanitizer"
DESCRIPTION = "Pluto is a utility to help users find deprecated Kubernetes apiVersions in \
their code repositories and their helm releases. \
Popeye is a utility that scans live Kubernetes cluster and reports potential \
issues with deployed resources and configurations. It sanitizes your cluster \
based on what's deployed and not what's sitting on disk. By scanning your \
cluster, it detects misconfigurations and helps you to ensure that best \
practices are in place, thus preventing future headaches. It aims at reducing \
the cognitive overload one faces when operating a Kubernetes cluster in the \
wild. Furthermore, if your cluster employs a metric-server, it reports \
potential resources over/under allocations and attempts to warn you should your \
cluster run out of capacity. \
Popeye is a readonly tool, it does not alter any of your Kubernetes resources \
in any way!"
LICENSE = "Apache-2.0"

PV = "0.22.1"

RPM_NAME = "popeye-0.22.1-1.10.aarch64.rpm"
RPM_HASH = "bc71838cea35d5f17b9342f2c5d40a5f99c77b8e54e0599dbfdec230279909657bda251f72a1c53844e7e078b63ce8ee4a46da4496fb2ea6e56437fdd0a6046e"

RPROVIDES:${PN} += "popeye"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
