SUMMARY = "Test-ordering plugin for pytest"
DESCRIPTION = "Test-ordering plugin for pytest \
 \
When installed, test classes marked @pytest_sourceorder.ordered \
will have tests run in the order of their definition. \
 \
Methods are ordered by line nuber of their definition, so \
spreading them between multiple files or otherwise defining them \
outside of their class might cause the plugin to order them \
wrong. \
 \
When inheriting from an ordered test class, the superclass’ \
methods will be run first (even if overridden), followed by the \
ones from subclasses. You generally do not want to apply an \
additional @ordered decorator to the subclasses – doing so will \
reset the inheritance-based ordering."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.0"

RPM_NAME = "python313-pytest-sourceorder-0.6.0-2.5.noarch.rpm"
RPM_HASH = "21c3219ed95cd7b91ebdb18359ffd1ef42d38255c3c8182e14f831ae52f56cd03db309579a9e351f2c285677a4e4db541dc7c75fbe0eb8445510eda436a66ed6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-sourceorder \
python3.13dist-pytest-sourceorder \
python313-pytest-sourceorder \
python3dist-pytest-sourceorder"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
