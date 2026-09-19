SUMMARY = "Microsoft Azure Developer LoadTesting Client Library for Python"
DESCRIPTION = "Microsoft Azure Developer LoadTesting Client Library for Python"
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-azure-developer-loadtesting-1.0.1-1.6.noarch.rpm"
RPM_HASH = "b534b0d22775ac38d8adc0676b8257de703043688ab67165d93520f8aa504c920a579ac323ca9eb4ec45573a278d763dab5fbb5ea02b2ae43c0d2eac1bfad48b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-developer-loadtesting \
python314-azure-developer-loadtesting \
python3dist-azure-developer-loadtesting"

RDEPENDS:${PN} += "python-abi \
python314-azure-core \
python314-azure-nspkg \
python314-isodate"

inherit rpm
