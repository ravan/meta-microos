SUMMARY = "Documentation for texlive-outilsgeomtikz"
DESCRIPTION = "This package includes the documentation for texlive-outilsgeomtikz"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.7svn75985"

RPM_NAME = "texlive-outilsgeomtikz-doc-2026.226.0.0.1.7svn75985-61.2.noarch.rpm"
RPM_HASH = "8889f2e01c3819a761a8f7c86b273a9b88bf15286696f8142778e19a777d07ae10d0d9ec69b2878803b0e2e5e6ebef10cf86f64f97f24dc5ddf4373d45eaa0ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-outilsgeomtikz-doc-fr \
texlive-outilsgeomtikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
