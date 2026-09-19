SUMMARY = "GAP: package for drawing integers"
DESCRIPTION = "The IntPic package, is a package for drawing integers, by emphasizing \
some subsets."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "gap-intpic-0.4.0-1.6.noarch.rpm"
RPM_HASH = "8f05af944206c30b058b429d74b9041d9ce79acdb352d0b019748e1256f84b5a55a0ad38762e68cb4a04abf94ed184ea67e84fb72fa911fb3cf0e5027f7392de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-intpic"

RDEPENDS:${PN} += "gap-core \
gap-gapdoc \
gap-numericalsgps"

inherit rpm
