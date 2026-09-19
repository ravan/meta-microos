SUMMARY = "Core Python benchmark code for ASV"
DESCRIPTION = "Core Python benchmark code for asv. \
 \
This package shall not have any dependencies on external packages and \
must be compatible with all Python versions greater than or equal to \
3.7. For other functionality, refer to the asv package or consider \
writing an extension."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "python313-asv-runner-0.3.1-1.1.noarch.rpm"
RPM_HASH = "b0aea898aec1a548b8cc973468bbb59ce5e3f2dfda6dda6285fcc3b713c00acf8b6d8565146433ab6b6ca9e1e1d17a1aa02257fd5c4884fb890b9f164d38531a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asv-runner \
python3.13dist-asv-runner \
python313-asv-runner \
python3dist-asv-runner"

RDEPENDS:${PN} += "python-abi"

inherit rpm
