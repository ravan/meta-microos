SUMMARY = "needs-restarting compatibility with zypper"
DESCRIPTION = "provides compatibility to YUM needs-restarting command using zypper"
LICENSE = "GPL-2.0-or-later"

PV = "1.14.101"

RPM_NAME = "zypper-needs-restarting-1.14.101-1.1.noarch.rpm"
RPM_HASH = "5b706c24ef30158dd2d157f4204502ebd7af14efb66771f7ba1fdd2d9b974375a425f4107181a1162467e894498b30f47424c9006d458145eb614e92d30ed023"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zypper-needs-restarting"

RDEPENDS:${PN} += "/usr/bin/bash \
zypper"

inherit rpm
