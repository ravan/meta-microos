SUMMARY = "m4 macros for pkgconf"
DESCRIPTION = "This package includes m4 macros used to support PKG_CHECK_MODULES \
when using pkgconf with autotools."
LICENSE = "GPL-2.0-or-later-with-Autoconf-exception-2.0"

PV = "2.5.1"

RPM_NAME = "pkgconf-m4-2.5.1-1.5.noarch.rpm"
RPM_HASH = "93617fd1af57f27c9cbce0c1306105b71c1693a143d0bc45a4e653a1379dc30510a9b7c249be3f6ec167aa352f5a2b66bb211df2ea2345328d800715d31e171c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconf-m4"

RDEPENDS:${PN} += ""

inherit rpm
