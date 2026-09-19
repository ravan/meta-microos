SUMMARY = "Data files for libsigrok"
DESCRIPTION = "libsigrok is a shared library written in C which provides the basic API \
for talking to logic analyzer hardware and reading/writing the acquired data \
into various input/output file formats."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.0~git20241020.f06f788"

RPM_NAME = "libsigrok-data-0.6.0~git20241020.f06f788-1.7.noarch.rpm"
RPM_HASH = "4d21e591e1eecf2bb453acc4522bc9d7b966ef8df1823e03ad27ee86f5781e3f426125c6dd61c2951333b7df6c66d80b27776d25964aa5a9b8218cd6bea001b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsigrok-data"

RDEPENDS:${PN} += "hicolor-icon-theme \
shared-mime-info"

inherit rpm
