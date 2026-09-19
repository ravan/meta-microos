SUMMARY = "CLI for the Arlon cluster lifecycle management and configuration tool"
DESCRIPTION = "Arlon is a declarative, gitops based fleet management tool for Kubernetes \
clusters. It allows administrators to: \
 \
* Deploy and upgrade a large number of workload clusters \
* Secure clusters by installing and configuring policies \
* Install a set of applications / add-ons on the clusters \
 \
all in a structured, predictable manner. \
 \
Arlon makes Kubernetes cluster fleet management secure, version controlled, \
auditable and easy to perform at scale. \
 \
This package contains the CLI."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "arlon-cli-0.10.0-1.13.aarch64.rpm"
RPM_HASH = "ff007d3e518b4f34ef74d68548fbaf133bdd924839e33e39b09fc2902bb96f4bc6148fa726c5a1ee0e3afab5ecb450ad1eef86d0c9d752281e652503d80b3508"

RPROVIDES:${PN} += "arlon-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
