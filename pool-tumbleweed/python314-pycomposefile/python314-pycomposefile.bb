SUMMARY = "Structured deserialization of Docker Compose files"
DESCRIPTION = "Structured deserialization of Docker Compose files."
LICENSE = "MIT"

PV = "0.0.34"

RPM_NAME = "python314-pycomposefile-0.0.34-1.4.noarch.rpm"
RPM_HASH = "c22271664bbb456bf058b1c1367f2e39257bafe72729a3dd749bf24190ef91f10965bde335115055cf7c39fbc9314d648084ed72a87317f7bff2899c26d86b12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pycomposefile \
python314-pycomposefile \
python3dist-pycomposefile"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML"

inherit rpm
