SUMMARY = "Documentation for texlive-tokglobalstack"
DESCRIPTION = "This package includes the documentation for texlive-tokglobalstack"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77947"

RPM_NAME = "texlive-tokglobalstack-doc-2026.226.1.0svn77947-59.2.noarch.rpm"
RPM_HASH = "696f5afdbcdd43889f31130adeda20c040c7f675e651750eac90923451db1f679c38df0d416f9e9c8cbac89cdcca7eb21307cd36b1580740982a72036f961b47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tokglobalstack-doc"

RDEPENDS:${PN} += ""

inherit rpm
