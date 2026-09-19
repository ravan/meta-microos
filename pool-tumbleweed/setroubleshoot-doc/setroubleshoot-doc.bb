SUMMARY = "Setroubleshoot documentation"
DESCRIPTION = "Setroubleshoot documentation package"
LICENSE = "GPL-2.0-or-later"

PV = "3.3.37"

RPM_NAME = "setroubleshoot-doc-3.3.37-1.1.noarch.rpm"
RPM_HASH = "5111a44044b33af6dcd34d19a55fb2d0ae3b7c323ce6e99aa5953714d5ea441dab103d80b7b1acc633a0f301a7f95b2679274ec943e6c910ec2a68a1d5b08ef7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "setroubleshoot-doc"

RDEPENDS:${PN} += "setroubleshoot"

inherit rpm
