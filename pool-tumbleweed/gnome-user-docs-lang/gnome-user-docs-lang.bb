SUMMARY = "Translations for package gnome-user-docs"
DESCRIPTION = "Provides translations for the 'gnome-user-docs' package."
LICENSE = "CC-BY-3.0"

PV = "50.4"

RPM_NAME = "gnome-user-docs-lang-50.4-1.1.noarch.rpm"
RPM_HASH = "6162ac59c55d57be626dec7f746fd6560c587002bcbe6a71b1042c08fc1b9ef91e95020cc7609ea951d2a7255e366b36fbf09a17966dc1ba69792a8d84595cf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-user-docs-lang \
gnome-user-docs-lang-all"

RDEPENDS:${PN} += "gnome-user-docs"

inherit rpm
