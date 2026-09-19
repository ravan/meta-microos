SUMMARY = "Script Checking Engine Library for OpenSCAP"
DESCRIPTION = "This package contains the Script Checking Engine Library (SCE) for OpenSCAP."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.4"

RPM_NAME = "libopenscap_sce33-1.4.4-1.3.aarch64.rpm"
RPM_HASH = "db8ea1abff7d6b421c8af71b639c1dc8f799ef84cb2aa74c3bb7c631d39129d6ad8b295bc32de7ab473b1bd57f8b41d3e97573e387ec14433e897a060561711b"

RPROVIDES:${PN} += "libopenscap-sce.so.33 \
libopenscap-sce33"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenscap.so.33"

inherit rpm
