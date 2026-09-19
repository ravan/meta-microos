SUMMARY = "Header files for the BPF Compiler Collection"
DESCRIPTION = "Headers and pkg-config build descriptions for developing BCC programs."
LICENSE = "Apache-2.0"

PV = "0.37.0"

RPM_NAME = "bcc-devel-0.37.0-4.1.aarch64.rpm"
RPM_HASH = "548e79e436dc39e4d11bc78211200c846acaae71ab9d4816a4c02141fa40441efaedea3b9c6b19a3d0c87baf1e7932fa40baaa49d61b0580c12d9d9f6fdc7edc"

RPROVIDES:${PN} += "bcc-devel \
pkgconfig-libbcc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbcc0"

inherit rpm
