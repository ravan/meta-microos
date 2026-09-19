SUMMARY = "A Powerline like prompt for Bash, ZSH and Fish"
DESCRIPTION = "A Powerline like prompt for Bash, ZSH and Fish. Based on Powerline-Shell by @banga. Ported to golang by @justjanne."
LICENSE = "GPL-3.0-or-later"

PV = "1.26"

RPM_NAME = "powerline-go-1.26-1.4.aarch64.rpm"
RPM_HASH = "334fe39fe1c0dbe5ed446cb9b87a412ba2dc833033e37e08cde85e7a800181796323695d169b8ae73dac9fe35928610755b65ef7cb3f22b3e946b3908ce03531"

RPROVIDES:${PN} += "powerline-go"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
