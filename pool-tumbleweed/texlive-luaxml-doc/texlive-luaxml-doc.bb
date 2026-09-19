SUMMARY = "Documentation for texlive-luaxml"
DESCRIPTION = "This package includes the documentation for texlive-luaxml"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2csvn78101"

RPM_NAME = "texlive-luaxml-doc-2026.226.0.0.2csvn78101-59.2.noarch.rpm"
RPM_HASH = "0e22ab310c197777fecd5a0efa7c898b5cd953eae5784ccfb322f76e7910b4d01d5c69861694bef5b66544c57445f7fa11666ea8eac7a9a78bf4bf0a39626ea0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaxml-doc"

RDEPENDS:${PN} += ""

inherit rpm
