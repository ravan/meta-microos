SUMMARY = "RPM Build Environment"
DESCRIPTION = "Minimal set of tools and libraries for building packages using the RPM package manager."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-base-devel_rpm_build-20170319-13.4.aarch64.rpm"
RPM_HASH = "49fc512104fffc7e01edbdfe51cf19de12e5c0f99a3cf49cef628d64f353ab968a02e6642fc5ed5a299bc3614eebbb219f712acbc36606e4a9fd6eacbd031892"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-devel-base-devel-rpm-build"

RDEPENDS:${PN} += "libnss-usrfiles2 \
man \
netcfg \
pattern- \
rpm-build"

inherit rpm
