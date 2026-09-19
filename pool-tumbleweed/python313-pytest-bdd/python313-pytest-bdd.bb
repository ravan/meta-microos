SUMMARY = "BDD for pytest"
DESCRIPTION = "BDD library for the py.test runner \
 \
pytest-bdd implements a subset of Gherkin language for the automation of the project \
requirements testing and easier behavioral driven development. \
 \
Unlike many other BDD tools it doesn't require a separate runner and benefits from \
the power and flexibility of the pytest. It allows to unify your unit and functional \
tests, easier continuous integration server configuration and maximal reuse of the \
tests setup. \
 \
Pytest fixtures written for the unit tests can be reused for the setup and actions \
mentioned in the feature steps with dependency injection, which allows a true BDD \
just-enough specification of the requirements without maintaining any context object \
containing the side effects of the Gherkin imperative declarations."
LICENSE = "MIT"

PV = "8.1.0"

RPM_NAME = "python313-pytest-bdd-8.1.0-2.4.noarch.rpm"
RPM_HASH = "f4c90f6dc8f894ce37d4b9859d63f200705bd41ccf886e0f5b08ea17115c3e52df63279bb4584d8b4073f52bd32732216f2d7d836480c94ef9f4c0a231df5e04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-bdd \
python3.13dist-pytest-bdd \
python313-pytest-bdd \
python3dist-pytest-bdd"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Mako \
python313-gherkin-official \
python313-packaging \
python313-parse \
python313-parse-type \
python313-pytest \
python313-typing-extensions \
update-alternatives"

inherit rpm
