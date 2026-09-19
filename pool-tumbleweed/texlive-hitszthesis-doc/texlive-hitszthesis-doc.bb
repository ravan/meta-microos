SUMMARY = "Documentation for texlive-hitszthesis"
DESCRIPTION = "This package includes the documentation for texlive-hitszthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2.1svn61073"

RPM_NAME = "texlive-hitszthesis-doc-2026.226.3.2.1svn61073-60.4.noarch.rpm"
RPM_HASH = "c07d502784db326c734bb7f352f84d5f07fb9996892799a9480666f9823441beb76fb73f3255e61bba2c50e7f0317963dfd646fa43eae8e0d7bd32547b33c7e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hitszthesis-doc-zh \
texlive-hitszthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
