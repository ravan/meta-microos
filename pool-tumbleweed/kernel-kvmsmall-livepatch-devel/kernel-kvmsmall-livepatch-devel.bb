SUMMARY = "Kernel symbols file used during kGraft patch development"
DESCRIPTION = "This package brings ipa-clones files, which are used to to track \
set of functions where a code from another function can eventually occur."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "kernel-kvmsmall-livepatch-devel-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "7ad6dab411ec955fd91971affbdcc8a46c4bb6ab60623fa0e3dae04ba03a8378a0a15b9d380cd956e36de0c7edfcdb6c3641ecae9155a5f292c9cc0da7fe990f"

RPROVIDES:${PN} += "kernel-kvmsmall-livepatch-devel"

RDEPENDS:${PN} += ""

inherit rpm
