SUMMARY = "API documentation for callaudiod"
DESCRIPTION = "A daemon for audio calls. \
This package contains API documentation for callaudiod."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.1.99"

RPM_NAME = "callaudiod-doc-0.1.99-2.1.noarch.rpm"
RPM_HASH = "266887623f679ae80a6411808ad4682504d1b079bd1255a7517b2b06c8ae9786dfdb2785e0161b327c362934249f5567c4282f6b457005fb52ec7b6859096bae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "callaudiod-doc"

RDEPENDS:${PN} += ""

inherit rpm
