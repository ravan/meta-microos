SUMMARY = "League Of Movable Type's 'Linden Hill' font family"
DESCRIPTION = "Linden Hill is a digital version of Frederic Goudy's Deepdene. The \
package includes roman and italic."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-lindenhill-fonts-0.20121218-8.15.noarch.rpm"
RPM_HASH = "2b9f5568708869f401ac406e864bb487b94b4d6ea64885fbca94f543167980a9b14ebae5b64cb8049bbd9601028347d24bde64859729438be36420b208d1f784"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-lindenhill-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
