SUMMARY = "A top-like tool for your Kubernetes clusters"
DESCRIPTION = "A top-like tool for your Kubernetes cluster. \
 \
Following the tradition of Unix/Linux top tools, ktop is a tool that displays \
useful metrics information about nodes, pods, and other workload resources \
running in a Kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "0.5.3"

RPM_NAME = "ktop-0.5.3-1.7.aarch64.rpm"
RPM_HASH = "b64ca7e1906ec62ab451b306a1d0b0f241667b4a0ed6607cffa431f49b27ee9218ae01b60468300fed053bdd82db040ffdbe05bae04bcdd8541853565abddbe9"

RPROVIDES:${PN} += "ktop"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
