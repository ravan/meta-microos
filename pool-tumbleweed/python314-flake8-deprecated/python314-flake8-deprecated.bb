SUMMARY = "Flake8 deprecations plugin"
DESCRIPTION = "This flake8 plugin helps you keeping up with method deprecations and giving hints about what \
they should be replaced with."
LICENSE = "GPL-2.0-only"

PV = "2.3.0"

RPM_NAME = "python314-flake8-deprecated-2.3.0-1.4.noarch.rpm"
RPM_HASH = "0f424f2ebd391b018a40ecad8e9a77fed29d87d4ca823b617f3e4d7f50e31ce933ccdce66704c62dcdafe400df616d2ef45cbb7f5d63cc911256a71775bca1b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flake8-deprecated \
python314-flake8-deprecated \
python3dist-flake8-deprecated"

RDEPENDS:${PN} += "python-abi \
python314-flake8"

inherit rpm
