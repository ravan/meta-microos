SUMMARY = "This package provides tab completion for dnglab on the bash shell"
DESCRIPTION = "dnglab provides a command line tool to convert camera RAW files to Digital \
Negative Format (DNG). \
 \
This package provides tab completion for dnglab on the bash shell."
LICENSE = "LGPL-2.1-only"

PV = "0.8.0"

RPM_NAME = "dnglab-bash-completion-0.8.0-1.1.noarch.rpm"
RPM_HASH = "9913e3af1f8cec275d00b92da9e5c6ee9a644cd1e955e1ce7fd046ab6713b7383f280baacc8ff3376ae3523b2694263f2b7e8e7772c8e5041d616d7605cb22f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnglab-bash-completion"

RDEPENDS:${PN} += "bash-completion \
dnglab"

inherit rpm
