SUMMARY = "Build addons locally for unified kernel images using mkosi"
DESCRIPTION = "This package provides the mkosi-addon wrapper to build PE addons containing \
customizations for unified kernel images specificto the running or local \
system."
LICENSE = "LGPL-2.1-or-later"

PV = "27"

RPM_NAME = "mkosi-addon-27-3.1.aarch64.rpm"
RPM_HASH = "934b0415d17581fecf4317db365ea55fd5c9045058c3144305047c4cbf8e5165790ed60500cf56ee0495cdd164b50b3565f7da584d40a9e8b99446f1e1d378cf"

RPROVIDES:${PN} += "mkosi-addon"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
coreutils \
mkosi"

inherit rpm
