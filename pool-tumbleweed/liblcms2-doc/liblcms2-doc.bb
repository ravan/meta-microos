SUMMARY = "User and developer documentation for lcms2"
DESCRIPTION = "This package contains user and developer documentation for lcms2."
LICENSE = "MIT"

PV = "2.19.1"

RPM_NAME = "liblcms2-doc-2.19.1-1.3.noarch.rpm"
RPM_HASH = "b324b5b13c99d436dce1e659ea34e80c14d3d27c5f07862af6b0e8719f06c88804019d07331d9bf9f9aff4a09b600b1c3ef374dc2a297fd767b33687d10ae530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblcms2-doc"

RDEPENDS:${PN} += ""

inherit rpm
