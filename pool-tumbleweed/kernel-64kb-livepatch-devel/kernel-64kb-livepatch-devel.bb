SUMMARY = "Kernel symbols file used during kGraft patch development"
DESCRIPTION = "This package brings ipa-clones files, which are used to to track \
set of functions where a code from another function can eventually occur."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "kernel-64kb-livepatch-devel-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "343ff75f4a3f81ff96075d84fa0c9ba09e03da9b41703755a53c4e18fc844da45d2760a486e713730fdf0873254873bef965d6c8283984d7cf011dcc10ab9faf"

RPROVIDES:${PN} += "kernel-64kb-livepatch-devel"

RDEPENDS:${PN} += ""

inherit rpm
