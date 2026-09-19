SUMMARY = "Header files for ktexteditor, an embeddable text editor component"
DESCRIPTION = "KTextEditor provides a text editor component that can be embedded in \
applications, either as a KPart or using the KF6::TextEditor library. \
 \
This subpackage provides the header files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-ktexteditor-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "8a8adfbb0c9ee290c7467384afa0888f63f3535610460eaf4b90693aac6fb616118998e108ba1e0a6e31161309bd9878ba4a82ce334179eb24ba9eacae941ebb"

RPROVIDES:${PN} += "cmake-KF6TextEditor \
kf6-ktexteditor-devel"

RDEPENDS:${PN} += "cmake-KF6Parts \
cmake-KF6SyntaxHighlighting \
libKF6TextEditor6"

inherit rpm
