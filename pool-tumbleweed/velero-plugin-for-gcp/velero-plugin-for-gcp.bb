SUMMARY = "Velero plugin for GCP"
DESCRIPTION = "Plugins to support Velero on Google Cloud Platform (GCP)"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "velero-plugin-for-gcp-1.4.0-2.8.aarch64.rpm"
RPM_HASH = "c71b9e95eb399f97804b0b69eb09d37a1e1a10049e7fc8ec4c050d53a0fef3de357832dc4f08566f8c1142c43969c14f9cff45e7549d32a0279cf75716399e81"

RPROVIDES:${PN} += "velero-plugin-for-gcp"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
