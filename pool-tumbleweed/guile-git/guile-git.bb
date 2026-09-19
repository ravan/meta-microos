SUMMARY = "Guile bindings of libgit2"
DESCRIPTION = "This package provides Guile bindings to libgit2, \
a library manipulate repositories of the Git version control system."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "guile-git-0.10.0-1.3.aarch64.rpm"
RPM_HASH = "7108cd5c62f0c5da949f32ebf849f10ee33fcb7792bcb14c9dbaa6ad965db76cfd65f217fc94339ddac5932d65a93d198c1c398211cce1de6f4b2860af8efda6"

RPROVIDES:${PN} += "guile-git"

RDEPENDS:${PN} += "/usr/bin/sh \
guile \
guile-bytestructures \
libgit2-devel"

inherit rpm
