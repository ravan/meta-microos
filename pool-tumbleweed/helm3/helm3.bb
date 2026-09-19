SUMMARY = "The Kubernetes Package Manager"
DESCRIPTION = "Helm is a tool for managing Kubernetes charts. Charts are packages of \
pre-configured Kubernetes resources."
LICENSE = "Apache-2.0"

PV = "3.21.3"

RPM_NAME = "helm3-3.21.3-6.1.aarch64.rpm"
RPM_HASH = "0e29ae99c92d3be7a8eaaf95f26522f9dd3e1fcfe070ab04bc95c0c0291322c6dfd768db9629b419db9e46b2cc730e474c83de7ddd8cfad448fe3ffee2b55d3f"

RPROVIDES:${PN} += "helm \
helm3"

RDEPENDS:${PN} += ""

inherit rpm
