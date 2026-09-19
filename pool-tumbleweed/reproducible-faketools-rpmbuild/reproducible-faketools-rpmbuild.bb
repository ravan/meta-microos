SUMMARY = "wrapper to include various other faketools"
DESCRIPTION = "This is a wrapper script that runs scripts from \
/usr/local/lib/reproducible-faketools/rpmbuild.d/"
LICENSE = "MIT"

PV = "0.5.5+0"

RPM_NAME = "reproducible-faketools-rpmbuild-0.5.5+0-1.7.noarch.rpm"
RPM_HASH = "b738b5697b93ef51fe30498e665821c72a356ec6f923a947b1a5f4ac754a89c538c1b1a8f18ea67b68adc1885a012a890dffcd68a2c8673ccb0504072e483fc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reproducible-faketools-rpmbuild"

RDEPENDS:${PN} += "/usr/bin/bash \
reproducible-faketools"

inherit rpm
