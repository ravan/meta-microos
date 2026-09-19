SUMMARY = "GStreamer documentation"
DESCRIPTION = "GStreamer documentation."
LICENSE = "(BSD-2-Clause | LGPL-2.1-or-later | MIT) & OPL-1.0 & CC-BY-SA-4.0"

PV = "1.28.6"

RPM_NAME = "gstreamer-docs-1.28.6-1.1.noarch.rpm"
RPM_HASH = "7533dab14bba2328cc6887174081a653a53f567dab75d42057c50f5e975b219682030b63b1bff63b4d6b85c2a2059781cbb4ea22ed890e7b48388d22919d370c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gstreamer-doc \
gstreamer-docs \
gstreamer-plugins-bad-doc \
gstreamer-plugins-base-doc \
gstreamer-plugins-good-doc \
gstreamer-plugins-libav-doc \
gstreamer-plugins-ugly-doc \
gstreamer-plugins-vaapi-doc"

RDEPENDS:${PN} += ""

inherit rpm
