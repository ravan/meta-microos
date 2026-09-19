SUMMARY = "Documentation for qt6-remoteobjects in HTML format"
DESCRIPTION = "This package contains documentation for qt6-remoteobjects in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-remoteobjects-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "3a10317a19d4f498b7a24c0328b97ef81283f2657f50e9b105c760a1a3869858894116f450573ba946903f234599d38f1e0c8f631be226eec3c2537196d6b00c"

RPROVIDES:${PN} += "qt6-remoteobjects-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
