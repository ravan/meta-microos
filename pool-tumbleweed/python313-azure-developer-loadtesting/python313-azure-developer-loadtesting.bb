SUMMARY = "Microsoft Azure Developer LoadTesting Client Library for Python"
DESCRIPTION = "Microsoft Azure Developer LoadTesting Client Library for Python"
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-azure-developer-loadtesting-1.0.1-1.6.noarch.rpm"
RPM_HASH = "6fbd8ef14d7467620b6da14abbc7038f344d69d7d081aa199d483c7b3899a3be03549e23327b99a0a632bc6a043e0ae1cd1100d518f4ae3d17fb504868a00a38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-developer-loadtesting \
python3.13dist-azure-developer-loadtesting \
python313-azure-developer-loadtesting \
python3dist-azure-developer-loadtesting"

RDEPENDS:${PN} += "python-abi \
python313-azure-core \
python313-azure-nspkg \
python313-isodate"

inherit rpm
