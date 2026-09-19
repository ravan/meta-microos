SUMMARY = "User-Agent generator for Python"
DESCRIPTION = "This module generates random, valid web user agents."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python314-user_agent-0.1.10-3.5.noarch.rpm"
RPM_HASH = "de609406c2ad21c2ca16a470d34a304f7e34a945372f7fd67aac013678682b712471f7de8296aa9216ddef9467c210f024f7aabb8adb76c94e57d2bd1cd7cb14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-user-agent \
python314-user-agent \
python3dist-user-agent"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
