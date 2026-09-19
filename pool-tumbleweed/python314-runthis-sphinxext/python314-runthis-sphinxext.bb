SUMMARY = "Provides a sphinx code-block for rendering RunThis blocks"
DESCRIPTION = "This provides a sphinx extension that adds RunThis code blocks, \
which display a highligthed code-block statically, but with a \
'RunThis' button above them. When the button is clicked, the code \
block is replaced by a terminal session that has executed that \
code."
LICENSE = "BSD-3-Clause"

PV = "0.0.3"

RPM_NAME = "python314-runthis-sphinxext-0.0.3-2.10.noarch.rpm"
RPM_HASH = "02f0c9a494585e594d75386c5c1ce8283be5f4471ac4cd81769c0f30b5b9d6bda2df732f034c0e6aae6857d425df8b58b09bd4ede1662827146960e59aec6a3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-runthis-sphinxext \
python314-runthis-sphinxext \
python3dist-runthis-sphinxext"

RDEPENDS:${PN} += "python-abi"

inherit rpm
