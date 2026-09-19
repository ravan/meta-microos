SUMMARY = "xSGE Path"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides paths for the SGE.  Paths are used to make \
objects move in a certain way."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.3"

RPM_NAME = "python314-xsge_path-1.0.3-2.5.noarch.rpm"
RPM_HASH = "4b2319bde9f2717a522603bacb18e1aec4611fecd4b880b851ab689e8f87c4be2447da5e0cb6c96fa56f86d04d509639e0365c3c8a8b9db51f39d628276c2539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xsge-path \
python314-xsge-path \
python3dist-xsge-path"

RDEPENDS:${PN} += "python-abi \
python314-sge-pygame"

inherit rpm
