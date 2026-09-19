SUMMARY = "Tools for Packaging with Open Build Service"
DESCRIPTION = "Tools for checkouting, patching, building and testing package via osc."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-osc-devel_osc_build-20170319-3.26.aarch64.rpm"
RPM_HASH = "dd7c5f3ea94c076e620a42bc7999cb453024bbd93f21abd3892e819a20dfd19506ce25c71272e01e294d299b2be4ba3969104c799dc8b353a002165cd61b7f39"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-devel-osc-devel-osc-build"

RDEPENDS:${PN} += "osc \
pattern-"

inherit rpm
