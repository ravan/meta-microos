SUMMARY = "Attract all documentations of installed TeXLive packages"
DESCRIPTION = "This package will attract all the documentation packages of any \
already installed TeXLive package."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & SUSE-TeX"

PV = "2026.222"

RPM_NAME = "texlive-alldocumentation-2026.222-68.2.noarch.rpm"
RPM_HASH = "9f1fbc53e281cec9f1645173146a8a17cc88ef54521f9f1aa298b618e420def22a4227565b016be09e6a6958e1be956005b220e986bbf6ff90a78880c19a99a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alldocumentation"

RDEPENDS:${PN} += ""

inherit rpm
