SUMMARY = "Yomi - Yet one more installer"
DESCRIPTION = "Yomi (yet one more installer) is a new proposal for an installer for \
the [open]SUSE family. It is designed as a SaltStack state, and \
expected to be used in situations were unattended installations for \
heterogeneous nodes is required, and where some bits of intelligence \
in the configuration file, can help to customize the installation. \
 \
Being also a Salt state makes the installation process one more step \
during the provisioning stage, making on Yomi a good candidate for \
integration in any workflow were SaltStack is used."
LICENSE = "Apache-2.0"

PV = "0.0.1+git.1630589391.4557cfd"

RPM_NAME = "yomi-formula-0.0.1+git.1630589391.4557cfd-2.15.noarch.rpm"
RPM_HASH = "2d021d160540104ba5212afd6a47d4dbfd167b20114705e5f7e4d94b5748cab5c910c53bb8215ccbd8e7ff2c0b4d4e1f715bc2dc918e9d74418e85f63583703c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-yomi-formula \
yomi-formula"

RDEPENDS:${PN} += "/usr/bin/python3 \
group-salt \
python3-base \
salt-formulas-configuration"

inherit rpm
