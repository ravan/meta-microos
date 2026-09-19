SUMMARY = "Set up SLURM Documentation Server"
DESCRIPTION = "Set up HTTP server for SLURM configuration."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "slurm-webdoc-25.11.2-1.6.noarch.rpm"
RPM_HASH = "2f8c9f0139871d35ea416022ae9af78efd134fc6badb367e3afaa118349637e717608ed0ae105ef97db9dcba2827cf2f00fb14a1d718797e16b17fd3abf342f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-slurm-webdoc \
slurm-webdoc"

RDEPENDS:${PN} += "apache2 \
slurm-doc"

inherit rpm
