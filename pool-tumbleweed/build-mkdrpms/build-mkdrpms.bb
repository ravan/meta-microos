SUMMARY = "Tools to generate delta rpms"
DESCRIPTION = "This package contains the parts which may be installed in the inner build system \
for generating delta rpm packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "20260505"

RPM_NAME = "build-mkdrpms-20260505-1.3.noarch.rpm"
RPM_HASH = "7ff5859c416ab7f74be78bf731b6bfdb885de74d844df9b34fb814039bdb2c7da9ac85ded6cb7f2ceac27bcf45b7be1c8f14a9a4c7678257f5c1563a9b9d9859"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-mkdrpms"

RDEPENDS:${PN} += "/usr/bin/perl \
build \
deltarpm"

inherit rpm
