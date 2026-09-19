SUMMARY = "Documentation for texlive-texshade"
DESCRIPTION = "This package includes the documentation for texlive-texshade"
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.1.29svn76586"

RPM_NAME = "texlive-texshade-doc-2026.227.1.29svn76586-62.2.noarch.rpm"
RPM_HASH = "25de3efb85b350c093b32e0d1b514fcade2159f7e4855069d676bc8cb0d08368d75d23ee4155447aec43d5a526c3bc6b994f6189d237182554482ca03395d2a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-texshade-doc-en \
texlive-texshade-doc"

RDEPENDS:${PN} += ""

inherit rpm
