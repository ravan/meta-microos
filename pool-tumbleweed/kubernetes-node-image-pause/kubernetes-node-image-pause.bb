SUMMARY = "Kubernetes pause image files"
DESCRIPTION = "This package contains the files needed for building the pause Docker image used \
by a Kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubernetes-node-image-pause-1.0.0-1.29.aarch64.rpm"
RPM_HASH = "6d5b510c0288cd0c51bea38ffedab3a93ef2e2ad17ad844b7d7444cc712e5639784829d5cc83c2011c52b56897e00ea0ee476264b680b0b64ae53ac358e0f818"

RPROVIDES:${PN} += "kubernetes-node-image-pause"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup"

inherit rpm
