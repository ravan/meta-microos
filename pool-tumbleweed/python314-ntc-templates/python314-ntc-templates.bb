SUMMARY = "Package to return structured data from the output of network devices"
DESCRIPTION = "TextFSM is a project built by Google that takes CLI string output and passes each line through a series of regular expressions until it finds a match. The regular expressions use named capture groups to build a text table out of the significant text. The names of the capture groups are used as column headers, and the captured values are stored as rows in the table."
LICENSE = "Apache-2.0"

PV = "9.2.0"

RPM_NAME = "python314-ntc-templates-9.2.0-1.1.noarch.rpm"
RPM_HASH = "2311f8e5710c19be46d31f94964cf1ac5cff5828d8eb429c96cc0998c5478b9372cf0b6aee95b7e2658e9d2b371f81afaf2219a5be7335b213661f1f87716de5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ntc-templates \
python314-ntc-templates \
python3dist-ntc-templates"

RDEPENDS:${PN} += "python-abi \
python314-textfsm"

inherit rpm
