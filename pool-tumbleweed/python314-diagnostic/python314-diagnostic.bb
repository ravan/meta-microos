SUMMARY = "Present errors that contain causes better understand what happened"
DESCRIPTION = "`diagnostic` makes it easier to build command line tools with great error reporting."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python314-diagnostic-3.0.0-1.2.noarch.rpm"
RPM_HASH = "a4929b5b921f2c160b747b610e628f1e411648f506dc159f8066a6f871756b29265c5034047e477b71bdff5301f01750a87516202a6d2ad3cbaf541d5578f372"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-diagnostic \
python314-diagnostic \
python3dist-diagnostic"

RDEPENDS:${PN} += "python-abi \
python314-docutils \
python314-markdown-it-py \
python314-rich"

inherit rpm
