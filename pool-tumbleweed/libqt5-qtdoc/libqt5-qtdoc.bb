SUMMARY = "Qt 5 API Documentation"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package pulls in the API documentation in HTML and QCH format."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "5.15.19"

RPM_NAME = "libqt5-qtdoc-5.15.19-1.3.noarch.rpm"
RPM_HASH = "e38122e7a17ae040173d2a2ae3aed17ae4d44ccc9c435c3e7391c6afb71bfb8fb284cb785d528d3d553f66185605544bafae1f8952ee1f64bf10139a47ac03b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtcharts-docs \
libqt5-qtdatavis3d-docs \
libqt5-qtdoc"

RDEPENDS:${PN} += "libqt5-qtdoc-html \
libqt5-qtdoc-qch"

inherit rpm
