SUMMARY = "Development files for murmurhash"
DESCRIPTION = "This subpackage contains header files for developing \
applications that want to make use of murmurhash."
LICENSE = "MIT"

PV = "1.0.15"

RPM_NAME = "python-murmurhash-devel-1.0.15-2.2.noarch.rpm"
RPM_HASH = "66ad67926af990106b9c6f1dee48ae8166a93a555c07332ad8a0163844f82e6ea4d05e7fb48d07f6aad8aa1c9086ef800de621681453c6a09e108ee9f8d55b45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-murmurhash-devel"

RDEPENDS:${PN} += ""

inherit rpm
