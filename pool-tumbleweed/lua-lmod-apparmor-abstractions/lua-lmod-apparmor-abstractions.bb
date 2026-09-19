SUMMARY = "Apparmor bash Abstraction for Lmod"
DESCRIPTION = "Profile for shell source scripts for lua-lmod"
LICENSE = "MIT"

PV = "8.7.55"

RPM_NAME = "lua-lmod-apparmor-abstractions-8.7.55-4.5.noarch.rpm"
RPM_HASH = "34f4a5987ba4dac5d7e2f6c0f9fdc9e31a8989b1178bd40902e433af64523d39a51236d79b1ed81cd550b099c8bea5bffcf4ded923c8119677c869c1ac17f423"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-lmod-apparmor-abstractions"

RDEPENDS:${PN} += "/usr/bin/sh \
apparmor-abstractions"

inherit rpm
