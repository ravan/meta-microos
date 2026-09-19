SUMMARY = "Libyui-qt-pkg header files"
DESCRIPTION = "This package contains the Qt package selector component for libyui. \
 \
This can be used independently of YaST for generic (C++) applications. \
This package has very few dependencies."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.7.7"

RPM_NAME = "libyui-qt-pkg-devel-4.7.7-1.1.aarch64.rpm"
RPM_HASH = "1762c66377dc516570d09b17a6f4a831d0bf215dcb7573bcc3b7705585afa81ea0be8dfde7d8468995ba5f9eb2352cf25586f44c1ff3cd21938a1f26d0ab90a1"

RPROVIDES:${PN} += "libyui-qt-pkg-devel"

RDEPENDS:${PN} += "libyui-qt-devel \
libyui-qt-pkg16 \
libzypp-devel"

inherit rpm
