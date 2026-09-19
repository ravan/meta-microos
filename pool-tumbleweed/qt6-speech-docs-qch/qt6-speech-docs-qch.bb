SUMMARY = "Documentation for qt6-speech in QCH format"
DESCRIPTION = "This package contains documentation for qt6-speech in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-speech-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "d4d405bbc04ece18367e5092a2a12c5017972e4571467e957b9086bb9f94cb03fe2bc72c8df447d2cf7a859e2abd385a758e9d8db7acb8b1fd97324400a8005a"

RPROVIDES:${PN} += "qt6-speech-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
