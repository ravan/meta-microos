SUMMARY = "Fixtures as classes that work well with dependency injection and more"
DESCRIPTION = "Typed factory fixtures that work well with dependency injection, autocompletetion, type checkers, and language servers. \
 \
No mypy plugins required!"
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python313-pytest-fixture-classes-1.0.4-1.5.noarch.rpm"
RPM_HASH = "cff8792806a44da310a70351d270b1f088e2c6d2fdc79c21b22697136d44a043103422d90128bb988f7b7b17d60884eb48277ae061e802e1b0eda26189de157f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-fixture-classes \
python3.13dist-pytest-fixture-classes \
python313-pytest-fixture-classes \
python3dist-pytest-fixture-classes"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
