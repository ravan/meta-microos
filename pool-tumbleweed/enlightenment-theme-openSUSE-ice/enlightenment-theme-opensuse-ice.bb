SUMMARY = "A light openSUSE theme modified to suite the openSUSE 13.2 artwork"
DESCRIPTION = "Ice is a light theme for enlightenment, this version has been modified to suite the artwork for openSUSE 13.2"
LICENSE = "BSD-2-Clause & LGPL-2.1-only & CC-BY-SA-3.0"

PV = "20220219.1.26"

RPM_NAME = "enlightenment-theme-openSUSE-ice-20220219.1.26-2.2.noarch.rpm"
RPM_HASH = "9ec99a68dd42156889bede99a1bde0c0cc17016c88129f8ec18d14df2d686d74cf009a2466465ccde4b7fcc4a6a8e40ad4bbcb3b1c90f82d01481284a4e105d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "enlightenment-theme \
enlightenment-theme-openSUSE-ice"

RDEPENDS:${PN} += ""

inherit rpm
