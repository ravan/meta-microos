SUMMARY = "Development files for KQuickImageEditor"
DESCRIPTION = "Development files for KQuickImageEditor, a set of QtQuick components providing \
basic image editing capabilities."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.0.1"

RPM_NAME = "kquickimageeditor6-devel-0.7.0.1-1.1.aarch64.rpm"
RPM_HASH = "7aed5a622ef506dbe4bc2964c61d14fb1b8ec64537ec98a614c7547807336be9515a600c101a6c003ce31715c2686f678d5060c14847be2a42f54500f5493e4d"

RPROVIDES:${PN} += "cmake-KQuickImageEditor \
kquickimageeditor6-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
kquickimageeditor6-imports \
libKQuickImageEditor1"

inherit rpm
