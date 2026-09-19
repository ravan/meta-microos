SUMMARY = "Rizin package manager"
DESCRIPTION = "This tool aims to be a cross platform package manager for the reverse engineering framework Rizin."
LICENSE = "LGPL-3.0-only"

PV = "0.3.6"

RPM_NAME = "rz-pm-0.3.6-1.1.aarch64.rpm"
RPM_HASH = "e08a1c509dc2363931f99f7b192fb967e591655b0999e1d2237b693973f1a0ad4faab66d7e770467f43dbca28e8e4faa6a9d0746a89518eeeff860691284adb8"

RPROVIDES:${PN} += "rz-pm"

RDEPENDS:${PN} += "libc.so.6 \
rizin"

inherit rpm
