SUMMARY = "Documentation for qt6-webchannel in HTML format"
DESCRIPTION = "This package contains documentation for qt6-webchannel in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-webchannel-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "b2b883e434bdcac8c3ba21c4ab38c66691daf095a8ba2f58436379496851e1e302faded85a3de2211ba527c23c26158e578fd9a884c83414de352c9e6207b6cc"

RPROVIDES:${PN} += "qt6-webchannel-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
