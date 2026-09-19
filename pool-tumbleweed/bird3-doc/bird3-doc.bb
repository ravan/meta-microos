SUMMARY = "Documentation for the BIRD Internet Routing Daemon"
DESCRIPTION = "The BIRD project aims to develop a fully functional dynamic IP routing daemon \
primarily targeted on (but not limited to) Linux, FreeBSD and other UNIX-like \
systems and distributed under the GNU General Public License. \
 \
This package holds the PDF documentation."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.2"

RPM_NAME = "bird3-doc-3.3.2-1.1.noarch.rpm"
RPM_HASH = "918c1db0fb9e35dacbbd6843a65cbda8556ef8c5a96b00957d7237488877743b867bb4e1d41f1f604c9c329507d964feaf422fa8f5a102b558b9362992af9863"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bird3-doc"

RDEPENDS:${PN} += ""

inherit rpm
