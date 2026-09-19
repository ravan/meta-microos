SUMMARY = "Binary files of tpic2pdftex"
DESCRIPTION = "Binary files of tpic2pdftex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77616"

RPM_NAME = "texlive-tpic2pdftex-bin-2026.20260301.svn77616-120.4.aarch64.rpm"
RPM_HASH = "dbaf6d2122606918cf97fd2977823e6e6af1535e450ea112bdd9f63cc7b0cd5c87582580cf03b96af520c23c912a35e2a072819a89741ca13f78de0606f57960"

RPROVIDES:${PN} += "texlive-tpic2pdftex-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
texlive-tpic2pdftex"

inherit rpm
