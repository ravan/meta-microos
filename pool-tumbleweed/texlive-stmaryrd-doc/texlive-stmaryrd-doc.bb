SUMMARY = "Documentation for texlive-stmaryrd"
DESCRIPTION = "This package includes the documentation for texlive-stmaryrd"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-stmaryrd-doc-2026.226.svn77682-64.2.noarch.rpm"
RPM_HASH = "a786358701dcc77be05d0a1334c6badd763a65131d2cad38d700b2adc377f23282a1ed7c2233036bd06ff737d4e91b35ee3c50b2463c0690d2cb27588456b387"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stmaryrd-doc"

RDEPENDS:${PN} += ""

inherit rpm
