SUMMARY = "Microsoft Azure Core Experimental Library for Python"
DESCRIPTION = "Azure Core Experimental client library provides experimental features that are not \
ready for stable release. The main reason might be because the feature depends on \
some other packages that there is no stable version available yet. If its dependant \
package introduces breaking changes, the features maybe break. It is not recommended \
to use azure core experimental library in production environment."
LICENSE = "MIT"

PV = "1.0.0~b3"

RPM_NAME = "python314-azure-core-experimental-1.0.0~b3-2.8.noarch.rpm"
RPM_HASH = "583edae67623597a2c0fb62888d3c4c919334f79c3e569e108445b569653dbe6ff07fa879d93abc65893f6b40c50ba4c60e862e9cda71338303954f490186852"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-core-experimental \
python314-azure-core-experimental \
python3dist-azure-core-experimental"

RDEPENDS:${PN} += "-python314-azure-core >= 1.25.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-nspkg"

inherit rpm
