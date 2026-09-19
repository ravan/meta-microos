SUMMARY = "Documentation for texlive-properties"
DESCRIPTION = "This package includes the documentation for texlive-properties"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn15878"

RPM_NAME = "texlive-properties-doc-2026.226.0.0.2svn15878-59.2.noarch.rpm"
RPM_HASH = "0ee702a6adb983b4aa729f4ea959adab167ab8fae8e13458bee9e10a66a0b05d85d83474f97c58db6fccf2655106abcbc679744b55d45c6664a7856bad0e1ef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-properties-doc"

RDEPENDS:${PN} += ""

inherit rpm
