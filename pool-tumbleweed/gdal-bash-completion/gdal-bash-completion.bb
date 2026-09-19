SUMMARY = "Bash completion for GDAL"
DESCRIPTION = "bash command line completion support for GDAL"
LICENSE = "BSD-3-Clause & MIT & LicenseRef-SUSE-Public-Domain"

PV = "3.13.3"

RPM_NAME = "gdal-bash-completion-3.13.3-1.1.noarch.rpm"
RPM_HASH = "85ecd24f35fa181705ba423ea3962a4cd6c6027b0399b39da8893aff57e70ab0213dd976f16324ab720a60b3d0c40cf3f98d814e5d5f41f718424f35fb96e3dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdal-bash-completion"

RDEPENDS:${PN} += "bash-completion \
gdal"

inherit rpm
