SUMMARY = "SELinux module for Google Cloud Guest OS Login"
DESCRIPTION = "This package provides the SELinux module for Google Cloud Guest OS Login."
LICENSE = "Apache-2.0"

PV = "20260731.00"

RPM_NAME = "google-guest-oslogin-selinux-20260731.00-1.1.noarch.rpm"
RPM_HASH = "6ace6624cd1c91bef40d40ff8ae6b9aad9fd7b96efee6ad535ea647218c8238941a28b150e3fb893f08b1c5cb5f8ad9e187b7a71eaaeae4de5a3400a03308907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-guest-oslogin-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
google-guest-oslogin \
libselinux-utils \
policycoreutils \
policycoreutils-python-utils \
selinux-policy \
selinux-policy-base"

inherit rpm
