SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "3.2.2"

RPM_NAME = "mathjax-typewriter-fonts-3.2.2-1.6.noarch.rpm"
RPM_HASH = "f95236741623b9f3227cfe6bcac6907cf4b1b9a0998700e49b40bdc0af8c771f7e07c97d51c5609aa1358e5911ea7e941550836f69918e40a20454c44ea647a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-typewriter-fonts"

RDEPENDS:${PN} += ""

inherit rpm
