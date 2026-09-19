SUMMARY = "CDI containers meta information (build service)"
DESCRIPTION = "The package provides meta information that is used during the build of \
the CDI container images."
LICENSE = "Apache-2.0"

PV = "1.65.0"

RPM_NAME = "obs-service-cdi1.65_containers_meta-1.65.0-3.1.aarch64.rpm"
RPM_HASH = "6ced5d400dcd31924a3608a87de9cb049a75259e76a4f0b9cb8e9ea9591653345bcdbf4346bb8588f061cef3438022a7e1c82ae4a7573fb51de71d9336838538"

RPROVIDES:${PN} += "obs-service-cdi-1.65-containers-meta \
obs-service-cdi-containers-meta \
obs-service-cdi1.65-containers-meta"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
