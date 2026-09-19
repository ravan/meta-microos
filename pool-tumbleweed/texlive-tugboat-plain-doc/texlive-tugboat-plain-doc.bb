SUMMARY = "Documentation for texlive-tugboat-plain"
DESCRIPTION = "This package includes the documentation for texlive-tugboat-plain"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.32svn75521"

RPM_NAME = "texlive-tugboat-plain-doc-2026.226.1.32svn75521-59.2.noarch.rpm"
RPM_HASH = "628bcb8250463b9ee857747a3c463c618b63c266eb6f318ce130ebfc02811d7e5787ec3eedcf881668e53a3fda78a6dfbd45d66652ac54fa00336bb7180bd520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tugboat-plain-doc"

RDEPENDS:${PN} += ""

inherit rpm
