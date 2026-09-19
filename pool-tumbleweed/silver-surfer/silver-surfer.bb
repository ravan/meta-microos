SUMMARY = "Kubernetes objects api-version compatibility checker"
DESCRIPTION = "Currently there is no easy way to upgrade Kubernetes objects in case of \
Kubernetes newer versions. There are some tools which are available for this \
purpose, but we found them inadequate for migration requirements. \
 \
kubedd is a tool to check issues in migration of Kubernetes yaml objects from \
one Kubernetes version to another. \
 \
It uses openapi spec provided by the Kubernetes with releases, for eg. in case \
of target kubernetes version 1.27 openapi spec for 1.27, to validate the \
kubernetes objects for depreciation or non-conformity with openapi spec. \
 \
Supported input formats \
* Directory containing files to be validated \
* Read kubernetes objects directly from cluster. Uses \
  kubectl.kubernetes.io/last-applied-configuration to get last applied \
  configuration and in its absence uses the manifest itself. \
 \
It provides details of issues with the Kubernetes object in case they are \
migrated to cluster with newer Kubernetes version."
LICENSE = "Apache-2.0"

PV = "0.1.4"

RPM_NAME = "silver-surfer-0.1.4-1.13.aarch64.rpm"
RPM_HASH = "48dab9983890158e033372b07d13229e8af0e9e274cdd92a9535aa06123115db2348d951fd7919be1a8f20f0b8820d423ec1def63bb829347ee09a2007575989"

RPROVIDES:${PN} += "kubedd \
silver-surfer"

RDEPENDS:${PN} += ""

inherit rpm
