SUMMARY = "Header files for the libcap-ng library"
DESCRIPTION = "The libcap-ng-devel package contains the files needed for developing \
applications that need to use the libcap-ng library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.5"

RPM_NAME = "libcap-ng-devel-0.8.5-1.10.aarch64.rpm"
RPM_HASH = "4bc0cf3783e952b1b8293b3ac8427c6a71bfec5b98242124764bb3583d8671c4f0911754dbf5c328b28cdcb96f8315cc61b58795193146cb7e0108888687e7d7"

RPROVIDES:${PN} += "libcap-ng-devel \
pkgconfig-libcap-ng"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
kernel-headers \
libcap-ng0 \
pkgconfig"

inherit rpm
