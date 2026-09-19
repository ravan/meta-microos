SUMMARY = "Qt 5 API Documentation in QCH format"
DESCRIPTION = "This package contains the Qt API Documentation in QCH format, which can be used by tools like KDevelop, Qt Assistant, Qt Creator, etc."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "5.15.19"

RPM_NAME = "libqt5-qtdoc-qch-5.15.19-1.3.noarch.rpm"
RPM_HASH = "943bdeae4abe04c3330e92daa0c4e39ba6df83965f44c0ea4930e3f9c80a2210c5179afbf22f74b3ecf65f0f671341f418d85fe65595607ebe3bf2a9beff6788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtdoc-qch"

RDEPENDS:${PN} += ""

inherit rpm
