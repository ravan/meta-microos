SUMMARY = "Site Paths Configuration for autoconf Based configure Scripts"
DESCRIPTION = "Site configuration for autoconf based configure scripts provides smart \
defaults for paths that are not specified."
LICENSE = "GPL-2.0-or-later"

PV = "0.2"

RPM_NAME = "site-config-0.2-15.5.aarch64.rpm"
RPM_HASH = "21bd7d45bcdb87d85db36929bd75f36577c4fa7b04cbc577f619384d1b42f8167cd7006cf75e4a8b704e4c4df39d0f588a0b8d87b08dc480f33c84009b0439c1"

RPROVIDES:${PN} += "site-config"

RDEPENDS:${PN} += ""

inherit rpm
