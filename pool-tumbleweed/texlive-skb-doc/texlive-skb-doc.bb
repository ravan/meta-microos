SUMMARY = "Documentation for texlive-skb"
DESCRIPTION = "This package includes the documentation for texlive-skb"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.52svn22781"

RPM_NAME = "texlive-skb-doc-2026.226.0.0.52svn22781-64.2.noarch.rpm"
RPM_HASH = "84445da9da0a7a441637f67977aa081ea39156a1054f7bc91adbd59475519a4ff741f52583730031c6787aa877cfcfc4369b367f0aa60f44989059b9583ea7e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skb-doc"

RDEPENDS:${PN} += ""

inherit rpm
