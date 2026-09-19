SUMMARY = "Qt 5 API Documentation in HTML format"
DESCRIPTION = "This package contains the Qt API documentation in html format."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "5.15.19"

RPM_NAME = "libqt5-qtdoc-html-5.15.19-1.3.noarch.rpm"
RPM_HASH = "2b752594c921cec4c36e3288d12f01421a4107f588fcee61d77c32679d975a29bb803ec57338e9ace6589bc696616de2f1cbc7244837b86ea944b1bd0c65682d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtdoc-html"

RDEPENDS:${PN} += ""

inherit rpm
