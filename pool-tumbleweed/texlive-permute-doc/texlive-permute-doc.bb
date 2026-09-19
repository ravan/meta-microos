SUMMARY = "Documentation for texlive-permute"
DESCRIPTION = "This package includes the documentation for texlive-permute"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-permute-doc-2026.226.svn15878-58.2.noarch.rpm"
RPM_HASH = "95b64c2fd924460750ef870fe56b31ab2686a63c897da6215cc0915ee48e19b9cfa324bea5c447e028d65e8aa33a88ed80a00a07092cb0bb8b0189560f37a369"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-permute-doc"

RDEPENDS:${PN} += ""

inherit rpm
