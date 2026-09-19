SUMMARY = "Entrypoint for the sidecar-shim container"
DESCRIPTION = "The package provides sidecar-shim binary than will call the respective \
hooks with the proper command-line arguments."
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "kubevirt1.8-sidecar-shim-1.8.4-5.1.aarch64.rpm"
RPM_HASH = "dfbe9bfdb32f7ab1cf3c608e3f4365593b76346550640e54f7edea1f3137d00cbf9526346eb1348c3b5e95fb8e4edca19158765d446960061b95ca0480431c18"

RPROVIDES:${PN} += "kubevirt-1.8-sidecar-shim \
kubevirt-sidecar-shim \
kubevirt1.8-sidecar-shim"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
