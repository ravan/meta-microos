SUMMARY = "Development files for NUnit"
DESCRIPTION = "This package contains development files for NUnit integration."
LICENSE = "MIT"

PV = "3.7.1"

RPM_NAME = "nunit3-devel-3.7.1-1.14.noarch.rpm"
RPM_HASH = "961beb7422ce0abde2bfd7da36c80978a83e11124faae6a1b270dda4b4f9ccefa8219dbcab3f26f5af8561510d2fa1da75b8ccc85e846cba7cfb6a8f5e96823a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nunit3-devel \
pkgconfig-nunit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
nunit3"

inherit rpm
