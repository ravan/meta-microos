SUMMARY = "Development package for libksieve"
DESCRIPTION = "This package contains development headers of libksieve."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libksieve-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "a4eb88f2de89011d3b42814f7c30bc86f6dc5f21a2cc5ba2c126ac89874354b6ac10279d98d16ed4ecfed770a85c124860bd35c46567f4702e50ce36e3527975"

RPROVIDES:${PN} += "cmake-KPim6KManageSieve \
cmake-KPim6KSieve \
cmake-KPim6KSieveCore \
cmake-KPim6KSieveUi \
libksieve-devel"

RDEPENDS:${PN} += "cmake-KF6SyntaxHighlighting \
libksieve6"

inherit rpm
