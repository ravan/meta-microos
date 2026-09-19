SUMMARY = "Headerfile for miniaudio"
DESCRIPTION = "Headerfile for miniaudio."
LICENSE = "MIT-0 | Unlicense"

PV = "0.11.25"

RPM_NAME = "miniaudio-devel-0.11.25-1.2.noarch.rpm"
RPM_HASH = "c2dbbd949ca9f15805f0d71c7e8031e027e2e538ec669bfd082097c52405a497edc1d07a72ce862b841402b1a0cbb19c9227c44a606308509ff9698dbef4864d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "miniaudio-devel"

RDEPENDS:${PN} += ""

inherit rpm
