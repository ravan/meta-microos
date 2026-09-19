SUMMARY = "CLI for the Perses observability visualisation project"
DESCRIPTION = "Perses, a Cloud Native Computing Foundation sandbox project, is a dashboard \
tool to visualize observability data from Prometheus/Thanos/Jaeger. \
 \
This package contains the CLI."
LICENSE = "Apache-2.0"

PV = "0.54.0"

RPM_NAME = "perses-cli-0.54.0-1.1.aarch64.rpm"
RPM_HASH = "51361bad308e2b12b7fccb74c2ea3a6ceb0f17d6561f2b14068f0407218d478b6a158c0df9dcb0da9ea097e96986d07a948a2c47f1e81ec74060e223d82e0b56"

RPROVIDES:${PN} += "percli \
perses-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
