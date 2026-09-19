SUMMARY = "Legacy usrmove helper files"
DESCRIPTION = "Legacy usrmove helper files for the build system. Do not install."
LICENSE = "GPL-3.0-or-later"

PV = "5.3.15"

RPM_NAME = "bash-legacybin-5.3.15-8.2.noarch.rpm"
RPM_HASH = "7662cc7c2c3f4b093778bfa8af2810f0e67a7eb1844157e38823e39b18c8a529bd373ff81925c05b26144247ed93e2d82b9379ec537c4aee74d1319101031a27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bash-legacybin"

RDEPENDS:${PN} += "bash \
this-is-only-for-build-envs"

inherit rpm
