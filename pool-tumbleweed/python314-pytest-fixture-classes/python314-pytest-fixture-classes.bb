SUMMARY = "Fixtures as classes that work well with dependency injection and more"
DESCRIPTION = "Typed factory fixtures that work well with dependency injection, autocompletetion, type checkers, and language servers. \
 \
No mypy plugins required!"
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python314-pytest-fixture-classes-1.0.4-1.5.noarch.rpm"
RPM_HASH = "e0f4bab7783ee44478baf536887def0f5fa0c2f3f80342642ec8b03cf416055ffd5ceba8c2091cbc5f66307f8daa8875d802ea222070299f4b6a2114cf438536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-fixture-classes \
python314-pytest-fixture-classes \
python3dist-pytest-fixture-classes"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
