SUMMARY = "Development files for the UCL library"
DESCRIPTION = "Headers and other development files for UCL library."
LICENSE = "GPL-2.0-or-later"

PV = "1.03"

RPM_NAME = "ucl-devel-1.03-6.8.aarch64.rpm"
RPM_HASH = "57f54c96c14f662e33bc095f2f884929d3108caa377998a635ec078f89273dd4dcdbf79d1aeea6628f0a01268490a129141c440f6e9503ad7b4358a09102c50b"

RPROVIDES:${PN} += "libucl1-devel \
ucl-devel"

RDEPENDS:${PN} += "libucl1"

inherit rpm
