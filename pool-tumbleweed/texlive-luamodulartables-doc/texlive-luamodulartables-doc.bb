SUMMARY = "Documentation for texlive-luamodulartables"
DESCRIPTION = "This package includes the documentation for texlive-luamodulartables"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn68893"

RPM_NAME = "texlive-luamodulartables-doc-2026.226.1.1svn68893-59.2.noarch.rpm"
RPM_HASH = "8f8e270626621c5770632838d612520d8ea097afa5c613834ea1954048973f34ef1c1e7f0ce7650803554daa432aa077f653c79b9fd5e5891d66f2e6e2040f8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luamodulartables-doc"

RDEPENDS:${PN} += ""

inherit rpm
