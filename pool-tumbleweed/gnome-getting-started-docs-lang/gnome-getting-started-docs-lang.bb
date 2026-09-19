SUMMARY = "Translations for package gnome-getting-started-docs"
DESCRIPTION = "Provides translations for the 'gnome-getting-started-docs' package."
LICENSE = "CC-BY-SA-3.0"

PV = "3.38.1"

RPM_NAME = "gnome-getting-started-docs-lang-3.38.1-1.16.noarch.rpm"
RPM_HASH = "47b85c177bb781fb667305d992c2807ce8726273c3bbd77c4390315b2e9d652372d269a4373ae7fb8f40076820561821c2d2ce9c6c2937c9f59800364bf8111b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-getting-started-docs-lang \
gnome-getting-started-docs-lang-all"

RDEPENDS:${PN} += "gnome-getting-started-docs"

inherit rpm
