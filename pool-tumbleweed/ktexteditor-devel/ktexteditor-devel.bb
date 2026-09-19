SUMMARY = "Header files for ktexteditor, an embeddable text editor component"
DESCRIPTION = "KTextEditor provides a text editor component that can be embedded in \
applications, either as a KPart or using the KF5::TextEditor library. \
 \
This subpackage provides the header files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "ktexteditor-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "eecc71a930bcc02a5ca45f3caaa5a759118e8f51f40ac9fc4088e16f2cc67bd2254f54c6d57605f4dd24271ecf1704152f5823c501a8a1dd7baea443181f2d13"

RPROVIDES:${PN} += "cmake-KF5TextEditor \
ktexteditor-devel"

RDEPENDS:${PN} += "cmake-KF5Parts \
cmake-KF5SyntaxHighlighting \
ktexteditor"

inherit rpm
