SUMMARY = "Development package for the liblrdf library"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
liblrdf library."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "liblrdf-devel-0.6.1-1.22.aarch64.rpm"
RPM_HASH = "5333851761b5dbe3ca7ebe6c9d91909036112dd3f42d46abbe1c6a4cfc42e806d155dee72b363e2b17a8c18896b4c6349fe5e8f939a949c6975a12eae043dcee"

RPROVIDES:${PN} += "liblrdf-devel \
pkgconfig-lrdf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblrdf2 \
libraptor-devel"

inherit rpm
