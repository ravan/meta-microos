SUMMARY = "Python wrapper for Subscene subtitle database"
DESCRIPTION = "Exposes the Subscene subtitle database API to Python."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python313-subscene-api-2.0.0-3.5.noarch.rpm"
RPM_HASH = "d2a9cd082410a1c63de2e2464ce62c05c47569f27298b1b63defccb158f559090dda56e0c267d473db19d5650726d0fd5c28b6d9c58e1ae816f4918bdd487f4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-subscene-api \
python3.13dist-subscene-api \
python313-subscene-api \
python3dist-subscene-api"

RDEPENDS:${PN} += "python-abi \
python313-beautifulsoup4"

inherit rpm
