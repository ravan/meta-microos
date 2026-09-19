SUMMARY = "Wraps Agama build for product composer"
DESCRIPTION = "Wraps Agama build as base image for product composer"
LICENSE = "MIT"

PV = "0.2.7"

RPM_NAME = "baseiso-containment-0.2.7-1.1.noarch.rpm"
RPM_HASH = "c3d1a18d47a41e2b4c50473d513b776b68742c47ab26edf9bf18fa687fb12b8ddeea22239065b606f202bcb6ff54883605e9b431099050e14403957aaa742697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "baseiso-containment"

RDEPENDS:${PN} += "/usr/bin/bash \
mkisofs"

inherit rpm
