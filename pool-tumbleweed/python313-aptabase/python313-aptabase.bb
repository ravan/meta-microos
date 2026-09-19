SUMMARY = "Python SDK for Aptabase"
DESCRIPTION = "Python SDK for Aptabase - privacy-first analytics for mobile, desktop and web applications."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python313-aptabase-0.1.0-1.1.noarch.rpm"
RPM_HASH = "fcb51cf2b7a1c0551af68d22e2b65b952a5c232adc36ef40d648d5835d251e2ea3b2c514c6c5d0073e633b3087aeaf1d2650c869e0e59f117996c93f8c1088dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aptabase \
python3.13dist-aptabase \
python313-aptabase \
python3dist-aptabase"

RDEPENDS:${PN} += "python-abi \
python313-base \
python313-httpx \
python314"

inherit rpm
