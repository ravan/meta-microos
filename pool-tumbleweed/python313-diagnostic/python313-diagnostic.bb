SUMMARY = "Present errors that contain causes better understand what happened"
DESCRIPTION = "`diagnostic` makes it easier to build command line tools with great error reporting."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python313-diagnostic-3.0.0-1.2.noarch.rpm"
RPM_HASH = "5a8e7d85f1582c7ccadaf97f1e16a213c8cbb24681b0ace106b13fb3bb63134029d7e2a727c31312ea9de64d468ada94b8bda9c059eb45672a555ae810d2b6c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-diagnostic \
python3.13dist-diagnostic \
python313-diagnostic \
python3dist-diagnostic"

RDEPENDS:${PN} += "python-abi \
python313-docutils \
python313-markdown-it-py \
python313-rich"

inherit rpm
