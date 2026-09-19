SUMMARY = "Documentation for texlive-uowthesistitlepage"
DESCRIPTION = "This package includes the documentation for texlive-uowthesistitlepage"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0.1svn54512"

RPM_NAME = "texlive-uowthesistitlepage-doc-2026.226.3.0.1svn54512-60.2.noarch.rpm"
RPM_HASH = "c17fe838a60b6b096f47b2838e04c9ad99d2f486b97527f06ba44b3a2e60a917936ca3f77dd4ced42e67a0e5cbe59f40a8900d11cab8b60d40f24bde93f4e6a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uowthesistitlepage-doc"

RDEPENDS:${PN} += ""

inherit rpm
