SUMMARY = "Translations for package NsCDE"
DESCRIPTION = "Provides translations for the 'NsCDE' package."
LICENSE = "GPL-3.0-only"

PV = "2.3"

RPM_NAME = "NsCDE-lang-2.3-1.8.noarch.rpm"
RPM_HASH = "cbf5bac17dba76028aa583282bdfd57d4ab8cb0b872135c5d183c9d2b14caac7c1d3bff60f91f05e8a79b0e3f208563171d5c0c079967d1614c19948305750d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NsCDE-lang \
NsCDE-lang-all \
locale-NsCDE-hr"

RDEPENDS:${PN} += "NsCDE"

inherit rpm
