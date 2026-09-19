SUMMARY = "Set of item views extending the Qt model-view framework"
DESCRIPTION = "KItemViews includes a set of views, which can be used with item models. It \
includes views for categorizing lists and to add search filters to flat and \
hierarchical lists."
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kitemviews-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "fc46af42c456b2af26089f6198aceb5c8f9c330776f2980e315526dc82d623a4e8a7ff207d503e2d0ffc19290405334947e3727be509753fab3133cef9db58d0"

RPROVIDES:${PN} += "kf6-kitemviews"

RDEPENDS:${PN} += ""

inherit rpm
