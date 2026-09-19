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

RPM_NAME = "python311-pytest-sourceorder-0.6.0-2.3.noarch.rpm"
RPM_HASH = "f28a021a8a0a5cd76a821165b2ed62ed1cfcddbe8bb91a9323f808906a9baac16f9ba1b6133966481843415b34b08cc5028047f494773d4c3405e812c93fe0de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-sourceorder \
python311-pytest-sourceorder \
python3dist-pytest-sourceorder"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
