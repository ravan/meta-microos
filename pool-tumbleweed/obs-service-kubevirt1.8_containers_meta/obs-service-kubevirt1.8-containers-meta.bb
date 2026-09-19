SUMMARY = "Kubevirt containers meta information (build service)"
DESCRIPTION = "The package provides meta information that is used during the build of \
the Kubevirt container images."
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "obs-service-kubevirt1.8_containers_meta-1.8.4-5.1.aarch64.rpm"
RPM_HASH = "23b36f7d7b21efbed00025812c05fd34fe5180f26cfc7477a7075fe2e523c565e74a0d96d2d87e51b43612a0e90c6cfcfcfb6f35f595f46de453ce7816d87999"

RPROVIDES:${PN} += "obs-service-kubevirt-1.8-containers-meta \
obs-service-kubevirt-containers-meta \
obs-service-kubevirt1.8-containers-meta"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
