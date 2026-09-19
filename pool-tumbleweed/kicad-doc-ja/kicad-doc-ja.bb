SUMMARY = "Japanese documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Japanese documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "10.0.6"

RPM_NAME = "kicad-doc-ja-10.0.6-1.1.noarch.rpm"
RPM_HASH = "bfb1d012261f8327466dfd1406d2f4aff363b4dc7fd1c96b348af6ca789b620e5b2c7160b61541eeea0f617e7ce4195686202a33f5665e6f0d91001f096645df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-ja \
locale-kicad-doc-ja"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
