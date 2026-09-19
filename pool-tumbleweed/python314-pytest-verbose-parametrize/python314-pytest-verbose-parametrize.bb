SUMMARY = "More descriptive output for parametrized pytest tests"
DESCRIPTION = "More descriptive output for parametrized pytest tests."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "python314-pytest-verbose-parametrize-1.8.1-1.7.noarch.rpm"
RPM_HASH = "f50dff2a3b4ce1b0becd6f414dd72dc888f1587ce199733b7a3ee80864a35e3fa00caa6c03274c21b095ee552584a6eba2a5932438d9162c09f1929e23bd2a8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-verbose-parametrize \
python314-pytest-verbose-parametrize \
python3dist-pytest-verbose-parametrize"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
