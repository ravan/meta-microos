SUMMARY = "openSUSE theme for Terminology"
DESCRIPTION = "openSUSE theme for Terminology"
LICENSE = "BSD-2-Clause & LGPL-2.1-only & CC-BY-SA-3.0"

PV = "20220430.1.26"

RPM_NAME = "terminology-theme-openSUSE-20220430.1.26-2.2.noarch.rpm"
RPM_HASH = "767705c597963cc428e62a66c630af3bb6c9ccc06d26e064f1a42d16e61744bd6269b17fb313c003854c2df9ef422b0bf6c8c7cc06a4f899dd31c76b23ad6124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "terminology-theme-dft \
terminology-theme-openSUSE"

RDEPENDS:${PN} += "terminology"

inherit rpm
