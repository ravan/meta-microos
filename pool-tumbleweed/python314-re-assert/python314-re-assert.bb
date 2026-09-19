SUMMARY = "Show Python regex match assertion failures"
DESCRIPTION = "Show where your regex match assertion failed."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-re-assert-1.1.0-3.5.noarch.rpm"
RPM_HASH = "e258641b9487e3f85aca765b63bb74f74cf8ab0768b9347533e349ef3b07942f541e6f9152e30c9adc42aed5edd395951484b9d413c0921f3a91e0af24ba0cb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-re-assert \
python314-re-assert \
python3dist-re-assert"

RDEPENDS:${PN} += "python-abi \
python314-regex"

inherit rpm
