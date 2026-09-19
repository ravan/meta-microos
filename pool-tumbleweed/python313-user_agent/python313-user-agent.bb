SUMMARY = "User-Agent generator for Python"
DESCRIPTION = "This module generates random, valid web user agents."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python313-user_agent-0.1.10-3.5.noarch.rpm"
RPM_HASH = "a09e96c222112db2d50bad2a2c5b651177d35c0d65990f31cd6149ba886b14e3ec72add22b17f5e926bf2cd61feadc87f1e255e84e77365be3f0385337f14915"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-user-agent \
python3.13dist-user-agent \
python313-user-agent \
python3dist-user-agent"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
