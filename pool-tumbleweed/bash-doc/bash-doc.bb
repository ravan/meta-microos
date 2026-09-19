SUMMARY = "Documentation how to Use the GNU Bourne-Again Shell"
DESCRIPTION = "This package contains the documentation for using the bourne shell \
interpreter Bash."
LICENSE = "GPL-3.0-or-later"

PV = "5.3.15"

RPM_NAME = "bash-doc-5.3.15-8.2.noarch.rpm"
RPM_HASH = "f5c6384111f4a9a9809ca0430684402593967f4f3d85beeb9c34436d4c9b0c4bc245f616db778217baa0e42c4d51026642e40692b805aa1d3c006fd62eb7104c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bash-/usr/share/info/bash.info.gz \
bash-doc"

RDEPENDS:${PN} += ""

inherit rpm
