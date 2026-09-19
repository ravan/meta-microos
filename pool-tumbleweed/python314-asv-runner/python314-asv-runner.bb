SUMMARY = "Core Python benchmark code for ASV"
DESCRIPTION = "Core Python benchmark code for asv. \
 \
This package shall not have any dependencies on external packages and \
must be compatible with all Python versions greater than or equal to \
3.7. For other functionality, refer to the asv package or consider \
writing an extension."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "python314-asv-runner-0.3.1-1.1.noarch.rpm"
RPM_HASH = "754bbc424a11bc1c0ae6259967926a867693061b2f6ad5c774ebdf9b6724276f017a59e7e44aa7c8a41d54af2da4b03bf99b5557bd78930f0b14d0906114ce32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-asv-runner \
python314-asv-runner \
python3dist-asv-runner"

RDEPENDS:${PN} += "python-abi"

inherit rpm
