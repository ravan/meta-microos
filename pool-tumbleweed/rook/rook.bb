SUMMARY = "Orchestrator for distributed storage systems in cloud-native environments"
DESCRIPTION = "Rook is a cloud-native storage orchestrator for Kubernetes, providing \
the platform, framework, and support for a diverse set of storage \
solutions to integrate with cloud-native environments. \
 \
See https://github.com/rook/rook for more information."
LICENSE = "Apache-2.0"

PV = "1.6.2+git0.ge8fd65f08"

RPM_NAME = "rook-1.6.2+git0.ge8fd65f08-3.16.aarch64.rpm"
RPM_HASH = "81a8da128902714d2cc0051c74a0ea4f3fb19b702ee8350b30c72ab150dfa079c5a37cf61355d3bc5eeb5935975c06471c7ae8b8857aeb9eeed68fce52cf6ade"

RPROVIDES:${PN} += "config-rook \
rook"

RDEPENDS:${PN} += "/usr/bin/sh \
pattern- \
tini"

inherit rpm
