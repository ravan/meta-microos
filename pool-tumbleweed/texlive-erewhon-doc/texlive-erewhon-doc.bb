SUMMARY = "Documentation for texlive-erewhon"
DESCRIPTION = "This package includes the documentation for texlive-erewhon"
LICENSE = "OFL-1.1"

PV = "2026.226.1.123svn77682"

RPM_NAME = "texlive-erewhon-doc-2026.226.1.123svn77682-61.4.noarch.rpm"
RPM_HASH = "b3e972a6a0a26898e80df9ac9db441f8fab9a4b1f465319f557540e19075a073476581e95cf82b8633de4e92ff90718dd2939425f86d21e497448ab7bbcf3640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-erewhon-doc"

RDEPENDS:${PN} += ""

inherit rpm
