SUMMARY = "Have a single source of version in your code base"
DESCRIPTION = "Utility to let you have a single source of version in your code base."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python313-single-version-1.6.0-1.12.noarch.rpm"
RPM_HASH = "db10010e50b359e123636fa23ac08e7f9ea3824f3b6c22db34a18bff6acf1f69b7d829a71f8c4163fb2464467288617f9063d9e5ba216cf942085cba320d473d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-single-version \
python3.13dist-single-version \
python313-single-version \
python3dist-single-version"

RDEPENDS:${PN} += "python-abi \
python313-first \
python313-importlib-metadata"

inherit rpm
