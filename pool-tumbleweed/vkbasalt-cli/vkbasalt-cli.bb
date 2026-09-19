SUMMARY = "Command-line utility for vkBasalt"
DESCRIPTION = "vkbasalt-cli (filename vkbasalt) is a CLI utility and library in conjunction with vkBasalt. This makes generating configuration files or running vkBasalt with games easier. This is mainly convenient in environments where integrating vkBasalt is wishful, for example a GUI application. Integrating vkbasalt-cli allows a front-end to easily generate and use specific configurations on the fly, without asking the user to manually write a configuration file"
LICENSE = "LGPL-3.0-only"

PV = "3.1.1"

RPM_NAME = "vkbasalt-cli-3.1.1-2.8.noarch.rpm"
RPM_HASH = "43e4607575271cc092e27ee6c92bcfa97753ec84ea93dd1821fa4550e8199b9350ef7eaed7d4a22bead5ba053fc50181cb3d5c9e6d687a37310b444e92621393"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-vkbasalt-cli \
python3dist-vkbasalt-cli \
vkbasalt-cli"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi"

inherit rpm
