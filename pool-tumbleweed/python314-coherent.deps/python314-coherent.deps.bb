SUMMARY = "Utilities for resolving imports to dependencies"
DESCRIPTION = "Coherent deps (dependencies) provides insights into the dependencies used by a code base, resolving imports to the dependencies that supply those imports. The Coherent OSS community presents this library to make the functionality available for a variety of uses."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python314-coherent.deps-1.6.0-1.4.noarch.rpm"
RPM_HASH = "b687116b18b52e32450c79140c7f9337992830b7e38c8b9465a7be42caab957093a7a48e7140f8b8021181db692193110505bfbf43a1965336fc6c9fcf06416d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-coherent.deps \
python314-coherent.deps \
python3dist-coherent.deps"

RDEPENDS:${PN} += "python-abi \
python314-jaraco.collections \
python314-jaraco.compat \
python314-jaraco.context \
python314-jaraco.functools \
python314-jaraco.mongodb \
python314-jaraco.ui \
python314-keyring \
python314-more-itertools \
python314-requests \
python314-requests-file \
python314-requests-toolbelt \
python314-retry-requests \
python314-tempora \
python314-tqdm \
python314-typer \
python314-zipp"

inherit rpm
