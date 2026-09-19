SUMMARY = "Package to return structured data from the output of network devices"
DESCRIPTION = "TextFSM is a project built by Google that takes CLI string output and passes each line through a series of regular expressions until it finds a match. The regular expressions use named capture groups to build a text table out of the significant text. The names of the capture groups are used as column headers, and the captured values are stored as rows in the table."
LICENSE = "Apache-2.0"

PV = "9.2.0"

RPM_NAME = "python313-ntc-templates-9.2.0-1.1.noarch.rpm"
RPM_HASH = "e865a294a91e310aba6c2aaafcaf218a14117b629405aa89a60bb4c7297d9b5fcb6b9b19c1e9aabe0db70c8ccb83fd374587debc92833137c3fc54b6261cd785"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ntc-templates \
python3.13dist-ntc-templates \
python313-ntc-templates \
python3dist-ntc-templates"

RDEPENDS:${PN} += "python-abi \
python313-textfsm"

inherit rpm
