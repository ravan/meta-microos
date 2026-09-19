SUMMARY = "Gedit smartspaces plugin"
DESCRIPTION = "The gedit smartspaces plugin"
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "gedit-plugin-smartspaces-50.0-1.2.aarch64.rpm"
RPM_HASH = "dd4fcde1cd57a44e17ebf6a335cacb7c39c75503e248c57e4abbb14cf2c85a3af1c28a5ae0929e0e8cc634ca4d332d6048f5212924439461d10995a5b8e5ad61"

RPROVIDES:${PN} += "gedit-plugin-smartspaces \
gedit-plugins-/usr/lib64/gedit/plugins/smartspaces.plugin \
libsmartspaces.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgedit-50.so \
libgedit-gtksourceview-300.so.5 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpeas-1.0.so.1"

inherit rpm
