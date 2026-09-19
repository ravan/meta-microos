SUMMARY = "Kernel symbols file used during kGraft patch development"
DESCRIPTION = "This package brings ipa-clones files, which are used to to track \
set of functions where a code from another function can eventually occur."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "kernel-default-livepatch-devel-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "039fcfff20855476e2713d56321c0f09d34b22eddcfb9db28de36bf56de0151c4e0f42b4c06c5f310eac8263a51c8f00398da044ec13506e4d2a26288cdc7768"

RPROVIDES:${PN} += "kernel-default-livepatch-devel"

RDEPENDS:${PN} += ""

inherit rpm
