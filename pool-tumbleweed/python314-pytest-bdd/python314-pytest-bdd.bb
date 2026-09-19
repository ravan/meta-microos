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

RPM_NAME = "python314-pytest-bdd-8.1.0-2.4.noarch.rpm"
RPM_HASH = "e5ce4b626c997eb1d7c4ea50a57bfad115a07e991e8ff5af4995ca9df30561851bcc4f457c285d0184ccc31759bfc83770947fbfe69e94699ace28ed7e35380e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-bdd \
python314-pytest-bdd \
python3dist-pytest-bdd"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Mako \
python314-gherkin-official \
python314-packaging \
python314-parse \
python314-parse-type \
python314-pytest \
python314-typing-extensions \
update-alternatives"

inherit rpm
