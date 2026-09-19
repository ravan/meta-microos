SUMMARY = "Neovim syntax highlighting for ghostty data files"
DESCRIPTION = "Optional files for syntax highlighting for ghostty data files in neovim."
LICENSE = "MIT & OFL-1.1"

PV = "1.3.1"

RPM_NAME = "ghostty-neovim-1.3.1-1.6.noarch.rpm"
RPM_HASH = "be4b977fa11c67b73cb7b43b211041aaa363cb58cdf9014654a98a2c048678117f95edcfd0039d9f2f54a756b7e770f4cd525b8885d9cea08ab7cf8c50132100"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghostty-neovim"

RDEPENDS:${PN} += "ghostty \
neovim"

inherit rpm
