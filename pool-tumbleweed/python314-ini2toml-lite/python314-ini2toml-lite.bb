SUMMARY = "Python ini2toml[lite] extra requirement"
DESCRIPTION = "The ini2toml[lite] extra requirements for python314-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.15"

RPM_NAME = "python314-ini2toml-lite-0.15-4.2.noarch.rpm"
RPM_HASH = "d157118de93e486b41d19c123dd49ee3dc2f7567f29ba52db6e2d47f6d2282198b142de2d3213f7101696c7ef67ce1b84c5ed7027c7c72d7f84936da30f3d56d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-ini2toml-lite"

RDEPENDS:${PN} += "-python314-tomli-w >= 0.4.0 with python314-tomli-w < 2 \
python314-ini2toml \
python314-tomli"

inherit rpm
