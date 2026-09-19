SUMMARY = "Matrix screensaver for vim"
DESCRIPTION = "Matrix screensaver for VIM, inspired by Chris Allegretta's cmatrix."
LICENSE = "MIT"

PV = "1.10"

RPM_NAME = "vim-plugin-matrix-1.10-64.2.noarch.rpm"
RPM_HASH = "412209ac5bf59087b7d4062247a3f2488488b490fea34ec9b4bb88caa770724c898cdcf2fef9a9eef88858cbeb270cc8e57a078435463c0ce8d2436b469f4d8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-matrix"

RDEPENDS:${PN} += "vim"

inherit rpm
