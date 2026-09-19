SUMMARY = "Bash completion for khal"
DESCRIPTION = "Bash shell completions for khal"
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "python-khal-bash-completion-0.14.1-1.1.noarch.rpm"
RPM_HASH = "8cdec9874e4fd6668675bdf42b1c1b96f5ac36ec79579cf4e970e5f2e77b0afc635fefa7054fd488c294c003f0dcab76064f4e29824a5356ef21686a0ebb6e89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-khal-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
