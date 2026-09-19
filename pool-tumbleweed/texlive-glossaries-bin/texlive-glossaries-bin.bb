SUMMARY = "Binary files of glossaries"
DESCRIPTION = "Binary files of glossaries"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn37813"

RPM_NAME = "texlive-glossaries-bin-2026.20260301.svn37813-120.4.aarch64.rpm"
RPM_HASH = "8991d9d53b55ae275d773fa4b2578f6098d6baa6e0691132bf86b254455de4e727228496e9dcaf58323a9b9040250e5865ea124d4ed0808efb8380a2db661637"

RPROVIDES:${PN} += "texlive-glossaries-bin"

RDEPENDS:${PN} += "texlive-glossaries"

inherit rpm
