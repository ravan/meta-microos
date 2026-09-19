SUMMARY = "A lexer and codec to work with LaTeX code in Python"
DESCRIPTION = "A lexer and codec to work with LaTeX code in Python."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python313-latexcodec-3.0.1-1.1.noarch.rpm"
RPM_HASH = "c462eb8027a56d8b4bc98a0fb19040d3a3cfd1a6fe78e24d3c68a5f33806c7c8cde1be0c4a427d221953552391e082d3279aed8ce6199e7e9b586cb8642512af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-latexcodec \
python3.13dist-latexcodec \
python313-latexcodec \
python3dist-latexcodec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
