SUMMARY = "CLI for declaratively setting up local Kubernetes clusters"
DESCRIPTION = "ctlptl (pronounced 'cattle patrol') is a CLI for declaratively setting up local \
Kubernetes clusters. \
 \
Inspired by kubectl and ClusterAPI's clusterctl, you declare your local cluster \
with YAML and use ctlptl to set it up."
LICENSE = "Apache-2.0"

PV = "0.9.5"

RPM_NAME = "ctlptl-0.9.5-1.1.aarch64.rpm"
RPM_HASH = "4a1d600ac280769d1b364994e7114dc052ade8ccd258459a4c02d1d457b9f0b08ccf25f74cf901e24c59cf42d38a1244ee8e672e54682c831f8012f2c32f0625"

RPROVIDES:${PN} += "ctlptl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
