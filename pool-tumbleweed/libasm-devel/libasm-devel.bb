SUMMARY = "A collection of utilities and DSOs to handle compiled objects"
DESCRIPTION = "This package contains the headers and libraries needed to build \
applications that require libasm."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.194"

RPM_NAME = "libasm-devel-0.194-1.4.aarch64.rpm"
RPM_HASH = "119ff2be15f196269538fbe73912fe2f16cc6271754bce361bd1de3902ec164b6a59069da0028d6842994c60c55c2c7143bc9654d2cf2d2d073ca03788396563"

RPROVIDES:${PN} += "libasm-devel"

RDEPENDS:${PN} += "glibc-devel \
libasm1"

inherit rpm
