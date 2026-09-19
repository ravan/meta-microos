SUMMARY = "SUSE Observability sts CLI"
DESCRIPTION = "The SUSE Observability sts CLI provides easy access to the functionality provided by the SUSE Observability APIs. It can be used for automation using SUSE Observability data, to configure SUSE Observability and to develop StackPacks."
LICENSE = "Apache-2.0"

PV = "3.3.6"

RPM_NAME = "stackstate-cli-3.3.6-1.4.aarch64.rpm"
RPM_HASH = "3a00b170181c7de7d1b203a00e6801bf86b3d6e7ec37841cc92ab66155a87cac50ac59fb0419986271ed96ac4c7f29da9eba204853f96a0c3e6c4a18a714e827"

RPROVIDES:${PN} += "stackstate-cli \
suse-observability-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
