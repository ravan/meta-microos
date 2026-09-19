SUMMARY = "Customization of kubernetes YAML configurations"
DESCRIPTION = "kustomize customizes raw, template-free kubernetes YAML files for \
multiple purposes, leaving the original YAML untouched and usable \
as is."
LICENSE = "Apache-2.0"

PV = "5.8.1"

RPM_NAME = "kustomize-5.8.1-1.3.aarch64.rpm"
RPM_HASH = "67b97ff7e513611c27b192eb630be89907566d219b6440df4dd2d3e7927d788d72b15af33f849a878a23f0f418d37a146a2518950040562718d3fa77f613289f"

RPROVIDES:${PN} += "kustomize"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
