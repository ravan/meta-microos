SUMMARY = "Documentation for texlive-quoting"
DESCRIPTION = "This package includes the documentation for texlive-quoting"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1csvn77682"

RPM_NAME = "texlive-quoting-doc-2026.226.0.0.1csvn77682-60.4.noarch.rpm"
RPM_HASH = "fd06fb472127b48278d1cc05571ac7b9209703a94903dd82518fd2c213c860f1d0040bec34268a7cd45e840a3392c08880297ce066b3f5b7490b5dfa1d5593f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quoting-doc"

RDEPENDS:${PN} += ""

inherit rpm
