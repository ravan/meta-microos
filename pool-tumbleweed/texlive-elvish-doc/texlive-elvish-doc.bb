SUMMARY = "Documentation for texlive-elvish"
DESCRIPTION = "This package includes the documentation for texlive-elvish"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-elvish-doc-2026.226.svn15878-61.4.noarch.rpm"
RPM_HASH = "43addaee69b62113ee9b56dc1aca92c3661249670a999304a347094733eb2fe3e60ec3304885d98453140fb249960998c9e26705d4d65bc48eeadaa81420d48f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elvish-doc"

RDEPENDS:${PN} += ""

inherit rpm
