SUMMARY = "GLib-schema org.gnome.nm-applet.eap"
DESCRIPTION = "The glib-schema allows libnma to be configured wia dconf \
 \
It is required by libnma"
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "libnma-glib-schema-1.10.6-3.12.noarch.rpm"
RPM_HASH = "5a00f85734d807cfecc85dc8330cef38b6339743f1576b0736246f1f649096b016cb018d8a83e717f4fd9a943365fb40a6018882a479f6c5164d94afc41d8165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libnma-glib-schema"

RDEPENDS:${PN} += ""

inherit rpm
