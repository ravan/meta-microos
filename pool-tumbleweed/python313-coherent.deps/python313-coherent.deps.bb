SUMMARY = "Utilities for resolving imports to dependencies"
DESCRIPTION = "Coherent deps (dependencies) provides insights into the dependencies used by a code base, resolving imports to the dependencies that supply those imports. The Coherent OSS community presents this library to make the functionality available for a variety of uses."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python313-coherent.deps-1.6.0-1.4.noarch.rpm"
RPM_HASH = "83abc2ba69e4cfb68425aee7b4c3fb01d9f23cc16e68ff972c508b9e2b0f04afdccc08536af470f5daca73f6e355f0450af36c8d119104ea1bd4d8999ef9770b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-coherent.deps \
python3.13dist-coherent.deps \
python313-coherent.deps \
python3dist-coherent.deps"

RDEPENDS:${PN} += "python-abi \
python313-jaraco.collections \
python313-jaraco.compat \
python313-jaraco.context \
python313-jaraco.functools \
python313-jaraco.mongodb \
python313-jaraco.ui \
python313-keyring \
python313-more-itertools \
python313-requests \
python313-requests-file \
python313-requests-toolbelt \
python313-retry-requests \
python313-tempora \
python313-tqdm \
python313-typer \
python313-zipp"

inherit rpm
