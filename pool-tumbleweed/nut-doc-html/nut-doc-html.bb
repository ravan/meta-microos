SUMMARY = "Network UPS Tools - Documentation in HTML"
DESCRIPTION = "User manual in HTML format. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.5"

RPM_NAME = "nut-doc-html-2.8.5-2.2.noarch.rpm"
RPM_HASH = "34afe2bb7e711af4d6552719b9139f5710059ac376576b0ba1a2863342d9c4dfae9fd2a4f7ea81187356e4e609c73854f455f19090bbc4d573a771c6fa7d1113"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nut-doc-html"

RDEPENDS:${PN} += "nut-doc-images"

inherit rpm
