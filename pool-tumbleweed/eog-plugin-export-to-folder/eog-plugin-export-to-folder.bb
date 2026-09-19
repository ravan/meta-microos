SUMMARY = "Eog export to folder plugin"
DESCRIPTION = "The Eye of Gnome export to folder plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "eog-plugin-export-to-folder-44.1-2.3.aarch64.rpm"
RPM_HASH = "105a8173ffee1cf36d263b4a31681708d271f014e2b17bc0a94bc0959bc34b41f552ae99348bfd403912353dce2f81d6d2b82f983a960c38cee888cee932847e"

RPROVIDES:${PN} += "eog-plugin-export-to-folder \
eog-plugins-/usr/lib64/eog/plugins/export-to-folder.plugin"

RDEPENDS:${PN} += "eog-plugins-data"

inherit rpm
