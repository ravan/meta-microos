SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "3.2.2"

RPM_NAME = "mathjax-vector-fonts-3.2.2-1.6.noarch.rpm"
RPM_HASH = "1c6cc952fc5937c2cef76145d8b93dfa93de803f2a9d005731ee52fc3781db2de8106fe61be7714fe0623eb7a3cfd982e3c51db27782a7201be17088d121815f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-vector-fonts"

RDEPENDS:${PN} += ""

inherit rpm
