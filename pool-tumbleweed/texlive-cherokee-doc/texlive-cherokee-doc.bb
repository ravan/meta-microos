SUMMARY = "Documentation for texlive-cherokee"
DESCRIPTION = "This package includes the documentation for texlive-cherokee"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn21046"

RPM_NAME = "texlive-cherokee-doc-2026.226.svn21046-60.2.noarch.rpm"
RPM_HASH = "565317fc7f9fd74aae8d0c17b600c2d291e5d7ff016a29603a6375ae0ce95e66dec8482538f06528483745360e7eee54c3b89bec9a8520b632fbe5b1a82dd6d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cherokee-doc"

RDEPENDS:${PN} += ""

inherit rpm
