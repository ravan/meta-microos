SUMMARY = "Documentation for texlive-step"
DESCRIPTION = "This package includes the documentation for texlive-step"
LICENSE = "OFL-1.1"

PV = "2026.226.2.0.5svn77682"

RPM_NAME = "texlive-step-doc-2026.226.2.0.5svn77682-64.2.noarch.rpm"
RPM_HASH = "5b64f31d02ee79d803b97c540d2bf6c0421b257f0d1236185f71f60d1392d75f2370a67bb263837bfda546d755d2294e477d2d55510019d38140204540485732"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-step-doc"

RDEPENDS:${PN} += ""

inherit rpm
