SUMMARY = "Documentation for texlive-jneurosci"
DESCRIPTION = "This package includes the documentation for texlive-jneurosci"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00svn76790"

RPM_NAME = "texlive-jneurosci-doc-2026.226.1.00svn76790-63.2.noarch.rpm"
RPM_HASH = "a29bad848656b4c02a00a2ea0f040bbe0c83277d46f4cb671752ed78ea7709924b6a1a3bc03c74ef0e8a66ab448830d9c14f15b96df8bdbc571a60a4fd76ea62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jneurosci-doc"

RDEPENDS:${PN} += ""

inherit rpm
