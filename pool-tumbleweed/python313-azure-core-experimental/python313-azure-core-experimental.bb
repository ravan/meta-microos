SUMMARY = "Microsoft Azure Core Experimental Library for Python"
DESCRIPTION = "Azure Core Experimental client library provides experimental features that are not \
ready for stable release. The main reason might be because the feature depends on \
some other packages that there is no stable version available yet. If its dependant \
package introduces breaking changes, the features maybe break. It is not recommended \
to use azure core experimental library in production environment."
LICENSE = "MIT"

PV = "1.0.0~b3"

RPM_NAME = "python313-azure-core-experimental-1.0.0~b3-2.8.noarch.rpm"
RPM_HASH = "e0ba7358759602796437e2e9741c341f6d38bacf0839afb3248d041c286c4e1cb1b082c4b821361dba08b73176a636bdf829e9ca56e4b012b8d8a704f7cacc71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-core-experimental \
python3.13dist-azure-core-experimental \
python313-azure-core-experimental \
python3dist-azure-core-experimental"

RDEPENDS:${PN} += "-python313-azure-core >= 1.25.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-nspkg"

inherit rpm
