SUMMARY = "CloudProviders Introspection bindings"
DESCRIPTION = "Cross desktop library for desktop integration of cloud storage \
providers and sync tools. \
 \
This package provides the GObject Introspection bindings for cloudproviders."
LICENSE = "LGPL-3.0-or-later"

PV = "0.4.1"

RPM_NAME = "typelib-1_0-CloudProviders-0_3_0-0.4.1-1.1.aarch64.rpm"
RPM_HASH = "b8f7a86e7bd331d946356c3e30fe448775c22584ace85886b227832c53fa47fe6af487c707d125fa5f88790c992a1e05544dbac83f4509e00aa2b758c639ed3a"

RPROVIDES:${PN} += "typelib-1-0-CloudProviders-0-3-0 \
typelib-CloudProviders"

RDEPENDS:${PN} += "libcloudproviders.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
