SUMMARY = "GAP: Crossed Modules and Cat1-Groups"
DESCRIPTION = "The XMod package provides a collection of functions for computing \
with crossed modules and cat1-groups, their derivations and sections, \
morphisms of these structures, and higher-dimensional \
generalisations."
LICENSE = "GPL-2.0-or-later"

PV = "2.99"

RPM_NAME = "gap-xmod-2.99-1.1.noarch.rpm"
RPM_HASH = "612af381e6743246ade324cf96d6d23aa5d7b44158eae72ca7c718f1854151b1ae1da8225c3680737950201727bd4b05e60fe868172af91a3a54a8272ebace8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-xmod"

RDEPENDS:${PN} += "gap-autpgrp \
gap-core \
gap-groupoids \
gap-hap \
gap-smallgrp \
gap-utils"

inherit rpm
