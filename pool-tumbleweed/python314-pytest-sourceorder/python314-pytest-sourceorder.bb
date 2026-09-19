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

RPM_NAME = "python314-pytest-sourceorder-0.6.0-2.5.noarch.rpm"
RPM_HASH = "ee5873dc58f0aaa7ae8df75495f0f4cb5bc2c05885c5da90218422bb277e5ca398742b8cd88180361c78ca24ad9bbbb126333f3a528cf7e14638dea142dbfe26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-sourceorder \
python314-pytest-sourceorder \
python3dist-pytest-sourceorder"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
