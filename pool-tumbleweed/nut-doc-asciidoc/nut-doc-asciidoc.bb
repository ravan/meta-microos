SUMMARY = "Network UPS Tools - Documentation in AsciiDoc Format"
DESCRIPTION = "NUT manuals in AsciiDoc format (human readable source). \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.5"

RPM_NAME = "nut-doc-asciidoc-2.8.5-2.2.noarch.rpm"
RPM_HASH = "e74c894665cf372c6389b13faea9f449824966b4852dcbcc76664578164745a0cffbec7ff312f62af4d038b4794f8a4f90b065f0505b554e9bbd674db8ceb60d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nut-doc-asciidoc"

RDEPENDS:${PN} += "nut-doc-images"

inherit rpm
