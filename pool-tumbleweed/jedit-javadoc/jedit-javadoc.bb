SUMMARY = "Programmer's text editor written in Java (Documentation)"
DESCRIPTION = "Javadoc for Programmer's text editor written in Java (Documentation)."
LICENSE = "GPL-2.0-or-later"

PV = "5.5.0"

RPM_NAME = "jedit-javadoc-5.5.0-7.9.noarch.rpm"
RPM_HASH = "16fd7efe223bc5d28f4a02806e05b8396c826e8f93869e878232f66cdc14a292545dadb96fbef34574094b0c0000fb12efaaaa6b47cfdac724c49e50404cb97e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jedit-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
