SUMMARY = "udev rules to use ZSA tools from normal users"
DESCRIPTION = "udev rules to use ZSA tools from normal users."
LICENSE = "MIT"

PV = "2.1.3+git13.623a50d"

RPM_NAME = "zsa-udev-rules-2.1.3+git13.623a50d-1.9.noarch.rpm"
RPM_HASH = "81078b0e4b6b9fa3797de42823c979bdfd992893a786976c06507e4b3ae22d402b36764d1ee92b663f34d85deac57ec28b46fd6f1413843666d4f9f858b1aaf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ergodox-wally-udev-rules \
zsa-udev-rules"

RDEPENDS:${PN} += ""

inherit rpm
