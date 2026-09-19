SUMMARY = "Local copy of Go vulnerability database"
DESCRIPTION = "govulncheck-vulndb provides a local copy of the Go vulnerability database \
https://vuln.go.dev as files in the Open Source Vulnerability (OSV) schema. \
This allows tools such as govulncheck to be used in offline environments. \
 \
Usage: \
 \
govulncheck -db file:///usr/share/vulndb"
LICENSE = "CC-BY-4.0"

PV = "0.0.20260910T144842"

RPM_NAME = "govulncheck-vulndb-0.0.20260910T144842-1.1.noarch.rpm"
RPM_HASH = "785e768dfb0876b2eea7b3ec34b3e302732946d0ce8fcf1ffad45a4bc80d94f6e17118599c0036590827b674c8da94371c1463cfcb2b1835fbab106f09de5936"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "govulncheck-vulndb"

RDEPENDS:${PN} += ""

inherit rpm
